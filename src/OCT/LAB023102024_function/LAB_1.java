package OCT.LAB023102024_function;

import java.util.Scanner;
public class LAB_1 {
    static void myMethod() {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        return;
    }

    public static void main(String[] args) {
        myMethod();
    }
}


