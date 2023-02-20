import java.util.Scanner;

public class loop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int m= n;
        int sum=0;
        while(n>0)
        {
            int r = n%10;
            n=n/10;
            sum = sum +(r*r*r);
        }
        System.out.println(+sum);
        if(sum==m)
        {
            System.out.println("IT is a Armstrong number");
        }
        else
            {
                System.out.println("It is not a Armstong number");
            }
            }
}
