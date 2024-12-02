package NOV.LAB20112024_ArrayList_collectionFramework.LAB01;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        List mylist = new ArrayList(); //Arrays format continues
        List mylist2 = new LinkedList(); // doubly Linked list

        List Fruits =  List.of("Orange","Banana","Mango");
        Fruits.add("Watermalon");

        System.out.println(Fruits);
    }
}