public class student {
    //instance variables of the class
    int id;
    String name;
    student(){
        System.out.println("this a default constructor");
    }
    student(int i, String n){
        id = i;
        name = n;
    }
    public static void main(String[] args) {
//object creation
        student s = new student();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);

        System.out.println("\nParameterized Constructor values: \n");
        student student = new student(10, "David");
        System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);
    }

    public void read() {
    }

    public void display() {
    }
}
class adder {
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println(adder.add(11,11));
        System.out.println(adder.add(11,11,11));
    }
}
class methodOverloading {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }
    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }
    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
}
class Adder{
    static double add(double a, double b){return a+b;}
    static double add(double a, double b, double v){return a+b;}
}
class TestOverloading2{
    public static void main(String[] args){
        System.out.println(adder.add(11,11));
        System.out.println(adder.add((int) 12.3, (int) 44.56));
    }
}
class MethodOverloading {
    private static void display(int a){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    private static void display(String a){
        System.out.println("Got String object.");
    }
    public static void main(String[] args) {
        display(1);
        display("Hello");
    }
}
