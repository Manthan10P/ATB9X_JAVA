package NOV.LAB20112024_ArrayList_collectionFramework.LAB01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ArrayList_Inputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList names = new ArrayList();
        ArrayList ages = new ArrayList();

        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the Name : ");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age : ");
            int age = scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to another record (Y/N) : ");
            continueInput = scanner.nextLine();
        }
        System.out.println(names);
        System.out.println(ages);

        for (Object o:names) {
            System.out.println(o);
        }
        for (Object o:ages){
            System.out.println(o);
        }

    }
}