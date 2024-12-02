package NOV.LAB21112024_LinkedList_Set_collectionFramework.LAB01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Class {
    public static void main(String[] args) {
        Student S1 = new Student("Manthan","25");
        Student S2 = new Student("Vijay","40");
        Student S3 = new Student("Makram","30");

        List<Student> mystudent = new ArrayList<>();
        mystudent.add(S1);
        mystudent.add(S2);
        mystudent.add(S3);

        S1.printdetails();
        S2.printdetails();
        S3.printdetails();

    }
}