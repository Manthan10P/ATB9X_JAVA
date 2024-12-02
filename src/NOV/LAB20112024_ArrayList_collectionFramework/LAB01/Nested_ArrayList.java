package NOV.LAB20112024_ArrayList_collectionFramework.LAB01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Nested_ArrayList {
    public static void main(String[] args) {
        List Fruits = new ArrayList();
        Fruits.add("Mango");
        Fruits.add("Banana");
        Fruits.add("Orange");

        List Fruits1 = new ArrayList();
        Fruits1.add("Graps");
        Fruits1.add("DragonFruit");
        Fruits1.add("KiWi");

        List City = new ArrayList();
        City.add("Vadodara");
        City.add("Mehsana");
        City.add("Ahmedabad");

        List AllFruits = new ArrayList();
        AllFruits.add(Fruits);
        AllFruits.add(Fruits1);
        AllFruits.add(City);

        System.out.println(AllFruits);
        System.out.println(Fruits);
        System.out.println(Fruits1);
        System.out.println(City);
    }

}