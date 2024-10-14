package OCT.LAB011102024;

public class LAB_1 {
    public static void main(String[] args) {
        //Arithmetic Operators
        // They are used to perform simple arithmetic operations on primitive and non-primitive data types.

        int a = 45; int b = 4;
        System.out.println(a+b);     // addition
        System.out.println(a*b);     // Multiplication
        System.out.println(a/b);    // Division
        System.out.println(a-b);    // Subtraction
        System.out.println(a%b);    // Modulo

        //Unary Operators
        int c = 10; int d = 10;
        System.out.println(c++);    //Postincrement
        System.out.println(++c);    //Preincrement
        System.out.println(d--);    //PostDecrement
        System.out.println(--d);    //PreDecrement

        //Assignment Operator
        int E = 7;
        System.out.println( E = +3);
        System.out.println( E = -2);
        System.out.println( E *= 6);
        System.out.println( E /= 6);
        System.out.println( E <<= 9);
        System.out.println( E >>= 3);
        System.out.println( E <<= 1);
        System.out.println( E >>= 2);
        System.out.println( E &= 01010);
        System.out.println( E != 00110);
        System.out.println( E ^= 01010);

        //  Relational Operators
        int F = 5; int G = 6;
        System.out.println(F < G);
        System.out.println(F > G);
        System.out.println(F &= G);
        System.out.println(F == G);
        System.out.println(F != G);
        System.out.println(F <= G);
        System.out.println(F >= G);

        //  Logical Operators

        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!y);

        // Ternary operator condition ? if true : if false

        int M = 20, N = 10, P = 30, result;
        result = ((M > N) ? (M > P) ? M : P : (N > P) ? N : P);
        System.out.println(result);


        // Shift operator number shift_op number_of_places_to_shift;

        int Q = 10;
        System.out.println("a<<1 : " + (Q << 1));
        System.out.println("a>>1 : " + (Q >> 1));


    }
}
