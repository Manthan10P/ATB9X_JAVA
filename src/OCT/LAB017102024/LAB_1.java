package OCT.LAB017102024;

import java.util.Scanner;

public class LAB_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and check number is even or odd :");
        int n = sc.nextInt();
        // n % 2 = 0 = odd
        // n % 2 = 1 = even

        if (n % 2 == 0) {
            System.out.println("the num is odd");
        } else {
            System.out.println("the num is even");
        }


    }

}