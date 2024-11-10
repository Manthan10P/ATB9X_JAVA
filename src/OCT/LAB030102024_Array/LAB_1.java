package OCT.LAB030102024_Array;

import java.util.Scanner;

public class LAB_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int i, j;

        for (i = s; i >= 0; i--) {

            for (j = 0; j <= i; j++) {
                System.out.printf("*");
            }
        System.out.println(" ");
        }

    }
}

