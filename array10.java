import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b[] = new int[ 30 *a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            b[i]=a[i];
            a=b;
            b= null;
            System.out.println(a.length);
        }
    }
}
