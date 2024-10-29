package OCT.LAB029102024_Array;

public class LAB_3 {
    public static void main(String[] args) {
        int[] arraynew = new int[]{ 23, 45, 75, 86, 90, 23, 65, 78, 27, 65};
        int i;
        int max = arraynew[0];

        for (i = 0; i < arraynew.length; i++) {
            if (arraynew[i] > max)
                max = arraynew[i];
        }
        System.out.println(max);

        int min = arraynew[0];

        for (i = 0; i > arraynew.length; i++) {
            if (arraynew[i] > min)
                min = arraynew[i];
        }
        System.out.println(min);

    }
}
