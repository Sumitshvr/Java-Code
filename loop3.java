import java.util.Scanner;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter m1,m2,m3");
            float m1 = sc.nextFloat();
            float m2 = sc.nextFloat();
            float m3 = sc.nextFloat();
            float total = m1 + m2 + m3;
            float avg = total / 3;
            System.out.println("TOTAL IS:" + total);
            System.out.println("AVERAGE IS:" + avg);
            if (avg>=70)
            {
                System.out.println("Grade A");
            }
            else if(avg>=60)
            {
                System.out.println("Grade B");
            }
            else if(avg>=50)
            {
                System.out.println("Grade C");
            }

            else  if(avg>=40)
            {
            System.out.println("Grade D");
            }
            else if(avg<40)
            {
                System.out.println("Fail");
            }
        }
}
