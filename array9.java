import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("enter the array:");
        int b[]=new int[10];
        for(int i=0;i<b.length;i++)
        {
            b[i]=a[i];
            System.out.println("Array elements are:"+b[i]);
        }
    }
}
