import java.util.Scanner;

public class loop9 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println("sum is:"+sum);
    }
}
