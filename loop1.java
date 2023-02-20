import java.util.Scanner;
public class loop1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<10;i++)
        {
            System.out.println("Enter a");
            int a = sc.nextInt();
            //int b = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
}
