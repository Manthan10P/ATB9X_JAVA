package OCT.LAB021102024_for_loop;

public class LAB_8 {
    public static void main(String[] args) {
        int i , j;
        int num  = 5;

        for (i = 0 ; i < 5 ; i++) {
            for (j = num ; j > i ; j--) {
                int number = 1;
                number= i +1 ;
                System.out.print(number);
            }
            System.out.println();
        }



    }
}
