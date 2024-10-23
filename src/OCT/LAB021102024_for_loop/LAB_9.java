package OCT.LAB021102024_for_loop;

public class LAB_9 {
    public static void main(String[] args) {
        int i , j;
        int num  = 6;

        for (i = 0 ; i < 6 ; i++) {
            for (j = num ; j > i ; j--) {
                int number = 1;
                number= j +1 ;
                System.out.print(number);
            }
            System.out.println();
        }
    }
}

