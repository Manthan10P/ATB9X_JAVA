package NOV.LAB19112024_Generic_collectionFramework.LAB02;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList1 {
    public static void main(String[] args) {
        //Collection list =new ArrayList(); runtime polymorphism dynamic disPATCH
        //List list1 = new ArrayList(); runtime polymorphism dynamic disPATCH
        ArrayList studentList = new ArrayList();
        studentList.add("Manthan");
        studentList.add("Panchal");
        studentList.add("God is great");
        studentList.add("God is great");  //Duplicate is allowed
        studentList.add("why are you worried");
        studentList.add(true);   //different types of data is allowed
        studentList.add(123);
        studentList.add(null);

        System.out.println(studentList);

    }

}