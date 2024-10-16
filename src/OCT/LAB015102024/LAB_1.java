package OCT.LAB015102024;

public class LAB_1 {
    public static void main(String[] args) {
        // variable = Expression1 ? Expression2 : Expression3 ;

        int a = 5;
        int b = 10;
        int c = 7;

        int Result = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("Largest number is" + Result);
    }
}
