import java.util.Scanner;

public class loop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number:");
        int n = sc.nextInt();
        int r;
        String str="";
        while(n>0)
        {
            r = n%10;
            n= n/10;
            str = str+r;
        }
        System.out.println(str);
        char c;
        for(int i =str.length()-1;i>=0;i--)
        {
           c= str.charAt(i);
           switch(c)
           {
               case '0':
                   System.out.printf("ZER0\t");
                   break;
               case '1':
                   System.out.printf("ONE\t");
                   break;
               case '2':
                   System.out.printf("TWO\t");
                   break;
               case '3':
                   System.out.printf("THREE\t");
                   break;
               case '4':
                   System.out.printf("FOUR\t");
                   break;
               case '5':
                   System.out.printf("FIVE\t");
                   break;
               case '6':
                   System.out.printf("SIX\t");
                   break;
               case '7':
                   System.out.printf("SEVEN\t");
                   break;
               case '8':
                   System.out.printf("EIGHT\t");
                   break;
               case '9':
                   System.out.printf("NINE\t");
                   break;

           }
        }
    }
}
