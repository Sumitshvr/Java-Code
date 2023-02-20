import java.util.Scanner;

public class loop8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
           n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int a=n*i;
            System.out.println(n+"*"+i+"="+a);
        }
    }
}
