package NOV.LAB22112024_Map_collectionFramework.LAB01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_Real_Example {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("Name","Manthan");
        student1.put("Number",898784589);
        student1.put("City","Ahmedabad");

        Set books_read = new HashSet();
        books_read.add("Rich dad poor dad");
        books_read.add("Secret");
        books_read.add("5'o clock");
        books_read.add("Atomic Habits");
        books_read.add("Atomic Habits");
        books_read.add("Eat the frogs");

        System.out.println(student1);
        System.out.println(books_read);
    }
}
