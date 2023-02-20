/*Display array elemnts*/
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int number = sc.nextInt();
        System.out.println("Enter array elements");
        int[] a = new int[10];
        for (int i = 0; i < number; i++)
        {
            a = new int[5];
        }
        for (int i = 0; i <= a[5]; i++) {
            System.out.println(+a[i]);
        }
    }
}
