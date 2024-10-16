package OCT.LAB016102024;

import java.util.Scanner;

public class LAB_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Good Name : ");
        String Name = sc.next();
        System.out.println("Please mention your Age :");
        int Age = Integer.parseInt(sc.next());
        System.out.println("What is current Salary :");
        double salary = Double.parseDouble(sc.next());

        System.out.println(Name);
        System.out.println(Age);
        System.out.println(salary);
    }
}
