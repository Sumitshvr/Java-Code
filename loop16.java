import java.util.Scanner;

public class loop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term:");
        int f = sc.nextInt();
        System.out.println("Enter the common difference:");
        int d= sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int term = f;
        for(int i=0;i<n;i++)
        {
            System.out.print(term+"\t");
            term = term +d;
        }

    }
}
