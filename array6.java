public class array6 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 345, 6, 78, 90, 222};
        int max = a[0];
        int max2=a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            else if(max2<a[i])
            {
                max2=a[i];
            }
        }
        System.out.println(max2);
    }
}