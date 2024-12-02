package NOV.LAB21112024_LinkedList_Set_collectionFramework.LAB01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_HS_LHS_TS {
    public static void main(String[] args) {
        Set HS = new HashSet();

        HS.add("Mango");
        HS.add("Orange");
        HS.add("Watermalon");
        HS.add(null);
        System.out.println(HS);

        Set lhs = new LinkedHashSet();

        lhs.add("Mango");
        lhs.add("Orange");
        lhs.add("Watermalon");
        lhs.add("Watermalon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Orange"));

        Set  ts = new TreeSet();
        ts.add("Mango");
        ts.add("Orange");
        ts.add("Watermalon");
        System.out.println(ts);
    }
}
