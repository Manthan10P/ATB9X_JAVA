package NOV.LAB21112024_LinkedList_Set_collectionFramework.LAB02;

import java.util.Enumeration;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Mango");
        vector.add("Orange");
        vector.add("Watermalon");
        System.out.println(vector);

        for (Object o:vector){
            System.out.println(vector);
        }

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }

}