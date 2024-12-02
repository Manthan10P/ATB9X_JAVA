package NOV.LAB22112024_Map_collectionFramework.LAB02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_P4 {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("Name","Manthan");
        student1.put("Number",898784589);
        student1.put("City","Ahmedabad");
        System.out.println(student1);

        Map<String,Object> student2 = new HashMap<>();
        student2.put("Name","Hemil");
        student2.put("Number",54362987);
        student2.put("City","Australia");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);


    }
}