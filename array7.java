public class array7 {
    public static void main(String[] args) {
        int a[] ={11,12,23,45,56,67,78,89,0};
        for(int x:a)
            System.out.print(x+",");
            System.out.println("");
            int temp= a[0];
        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;

        for(int x:a)
            System.out.print(x+",");
            System.out.println("");
    }
}
