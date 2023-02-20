import java.util.Scanner;

public class loop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int m=n;
        int rev = 0,r;
        while(n>0)
        {
             r= n%10;
            rev=rev* 10+r;
            n/=10;
        }
        if(rev == m)
        {
            System.out.println("IT IS A PALINDROME:");
        }
        else
        {
            System.out.println("IT IS NOT A PALINDROME");
        }
    }
}
