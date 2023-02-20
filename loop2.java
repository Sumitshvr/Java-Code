import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Enter a");
            int a = sc.nextInt();
            if (a > 14 && a < 55) {
                System.out.println("person is young");
            } else {
                System.out.println("Person is not young");
            }
        }
    }
}
