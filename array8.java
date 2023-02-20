public class array8 {
    public static void main(String[] args) {
        int a[]= new int[10];
        int n=6;
        a[0]=5;
        a[1]=9;
        a[2]=6;
        a[3]=23;
        a[4]=10;
        a[5]=12;
        for(int i=0;i<n;i++)
            System.out.print(a[i]+",");
            System.out.println("");
            int index=3;
        for(int i=n;i<index;i++)
            a[i]=a[i-1];
            a[index-1]=a[n];
        for(int i=0;i<n;i++)
            System.out.print(a[i]+",");
            System.out.println("");
    }
}
