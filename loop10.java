import java.util.Scanner;

public class loop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fact =1;
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("FACTORIAL IS:"+fact);

    }
}
