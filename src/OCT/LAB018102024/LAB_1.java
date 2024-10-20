package OCT.LAB018102024;

import java.util.Scanner;
// switch case using calculator
public class LAB_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First value :");
        int a = sc.nextInt();
        System.out.println("Enter the Second value :");
        int b = sc.nextInt();
        System.out.println("Enter the Operator :");

        char op = sc.next().charAt(0);   //store as char to enter the char value

        switch (op) {
            case '+' :
                System.out.println("calculate the addition " + (a+b));
                break;
            case '-':
                System.out.println("calculate the sub " + (a-b));
                break;
            case '*':
                System.out.println("calculate the multiplication " + (a*b));
                break;
            case '/' :
                System.out.println("calculate the division " + (a/b));
                break;
            case '%' :
                System.out.println("calculate the modules " + (a%b));
                break;

            default:
                System.out.println("Invalid Input");
        }
        //System.out.println(op);
    }
}
