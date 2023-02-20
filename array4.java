import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // System.out.println("Enter the no.of elements");
        //int n = sc.nextInt();
       // System.out.println("Enter the array elements");
        int a[] ={1,2,3,4,5,6,7,8,9,10};
     /*   for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }*/
            System.out.println("Enter the key to search:");
            int key = sc.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (key == a[i]) {
                    System.out.println("Element is found at index " + i);
                    System.exit(0);
                }
            }
        System.out.println("No element found");
    }
}



