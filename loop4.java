import java.util.Scanner;
public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num= sc.nextLine();
        if(num.matches("[01]+"))
        {
            System.out.println("RADIX BINARY:2");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("RADIX OCTAL:8");
        }
        else if(num.matches("[A-F0-9]+"))
        {
            System.out.println("RADIX HEXA:16");
        }
        else
            System.out.println("RADIX DECIMAL");
    }
}
