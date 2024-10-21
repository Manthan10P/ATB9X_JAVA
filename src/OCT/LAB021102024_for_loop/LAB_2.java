package OCT.LAB021102024_for_loop;

import java.util.Scanner;

public class LAB_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (i = i; i <= 10000; i++) {
            if ((i % 2) == 0) {
                System.out.println("This number is odd " + i);
                break;
            }
            else {
                System.out.println("This number is even " + i);
                break;
            }

        }
    }

}

