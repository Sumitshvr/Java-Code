import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a URL:");
        String url =sc.nextLine();
        String protocol = url.substring(0,url.indexOf(":"));
        if(protocol.equals("http"))
        System.out.println("Hypertext Transfer Protocol");
        else if(protocol.equals("ftp"))

            System.out.println("File Transfer Protocol");

        String ghf = url.substring(url.indexOf(".")+1);
        if(ghf.equals("com"))
        {
            System.out.println("Commercial Website");
        } else if (ghf.equals("org")) {
            System.out.println("Organisation");
        } else if (ghf.equals("net")) {
            System.out.println("NETWORK");
        }

    }
}
