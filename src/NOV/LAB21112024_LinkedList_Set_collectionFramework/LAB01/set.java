package NOV.LAB21112024_LinkedList_Set_collectionFramework.LAB01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {

        Set HS = new HashSet();
        Set lhs = new LinkedHashSet();
        Set  ts = new TreeSet();

        HS.add("Manthan");
        HS.add("Manthan");
        HS.add("Danthan");
        HS.add("manthan");
        HS.add("Panthan");

        System.out.println(HS);
    }
}