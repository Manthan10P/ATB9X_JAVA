package OCT.LAB023102024_function;

import java.util.Scanner;
public class LAB_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Enter the number : ");
        int b = sc.nextInt();

        int sum = sum_result(a, b);
        System.out.println(sum);

        int sub = sub_result(a, b);
        System.out.println(sub);

        int mul = mul_result(a, b);
        System.out.println(mul);

        int Div = Div_result(a, b);
        System.out.println(Div);
    }
        static int sum_result (int a , int b ) {
            return a + b;
        }

        static int sub_result (int a , int b ){
        return a-b ;
    }

        static int mul_result (int a , int b ) {
            return a * b;
        }
        static int Div_result (int a , int b ){
        return a/b ;

        }

}
            