package NOV.LAB20112024_ArrayList_collectionFramework.LAB02;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);

    }
}