import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year  = sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                }
            }
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
