package OCT.LAB024102024_function;

import java.util.Scanner;

public class LAB_1 {
    public static void My_method () {
        Scanner sc  = new Scanner(System.in);
        int Num = sc.nextInt();
        if (Num % 2 == 0) {
            System.out.println("The number is odd");
        }
        else {
            System.out.println("The number is even");
            }
        }

    public static void main(String[] args) {
        My_method();

    }
}

