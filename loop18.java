import java.util.Scanner;
public class loop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i =0;i<n-2;i++) {
            c=a+b;
            System.out.print(c+",");
           // fib(n) = fib(n - 2) + fib(n - 1);
            a=b;
            b=c;
        }

    }
}
