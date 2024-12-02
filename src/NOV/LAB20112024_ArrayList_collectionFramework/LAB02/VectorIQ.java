package NOV.LAB20112024_ArrayList_collectionFramework.LAB02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

public class VectorIQ {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(54);
        marks.add(92);
        marks.add(70);
        marks.add(87);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.reverseOrder();
        System.out.println(marks);
    }
}