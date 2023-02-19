import java.util.Scanner;
class staff {
    String StaffID, Name, Phone, Salary;

    Scanner input = new Scanner(System.in);
    void read() {
        System.out.println("Enter StaffID");
        StaffID = input.nextLine();

        System.out.println("Enter Name");
        Name = input.nextLine();

        System.out.println("Enter Phone");
        Phone = input.nextLine();

        System.out.println("Enter Salary");
        Salary = input.nextLine();
    }

    void display() {
        System.out.printf("\n%-15s", "STAFF ID: ");
        System.out.printf("%-15s \n", StaffID);
        System.out.printf("%-15s", "NAME: ");
        System.out.printf("%-15s \n", Name);
        System.out.printf("%-15s", "PHONE:");
        System.out.printf("%-15s \n", Phone);
        System.out.printf("%-15s", "SALARY:");
        System.out.printf("%-15s \n", Salary);
    }
}


class teaching extends staff {
    String Domain, Publication;

    void read_Teaching() {
        super.read(); // call super class read method
        System.out.println("Enter Domain");
        Domain = input.nextLine();
        System.out.println("Enter Publication");
        Publication = input.nextLine();
    }

    void display() {
        super.display(); // call super class display() method
        System.out.printf("%-15s", "DOMAIN:");
        System.out.printf("%-15s \n", Domain);
        System.out.printf("%-15s", "PUBLICATION:");
        System.out.printf("%-15s \n", Publication);
    }
}


class technical extends staff {
    String Skills;

    void read_Technical() {
        super.read(); // call super class read method
        System.out.println("Enter Skills");
        Skills = input.nextLine();
    }

    void display() {
        super.display(); // call super class display() method
        System.out.printf("%-15s", "SKILLS:");
        System.out.printf("%-15s \n", Skills);
    }
}


class contract extends staff {
    String Period;

    void read_Contract() {
        super.read(); // call super class read method
        System.out.println("Enter Period");
        Period = input.nextLine();
    }

    void display() {
        super.display(); // call super class display() method
        System.out.printf("%-15s", "PERIOD:");
        System.out.printf("%-15s \n", Period);
    }
}

class StaffDetails {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of staff details to be created");
        int n = input.nextInt();

        teaching[] teach = new teaching[n];
        technical[] tech = new technical[n];
        contract[] son = new contract[n];

        // Read Staff information under 3 categories

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Teaching staff information");
            teach[i] = new teaching();
            teach[i].read_Teaching();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Technical staff information");
            tech[i] = new technical();
            tech[i].read_Technical();
        }

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Contract staff information");
            son[i] = new contract();
            son[i].read_Contract();
        }

        // Display Staff Information
        System.out.println("\n STAFF DETAILS: \n");
        System.out.println("-----TEACHING STAFF DETAILS----- ");

        for (int i = 0; i < n; i++) {
            teach[i].display();
        }

        System.out.println();
        System.out.println("-----TECHNICAL STAFF DETAILS-----");
        for (int i = 0; i < n; i++) {
            tech[i].display();
        }

        System.out.println();
        System.out.println("-----CONTRACT STAFF DETAILS-----");
        for (int i = 0; i < n; i++) {
            son[i].display();
        }

        input.close();
    }
}
