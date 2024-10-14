package OCT.LAB010102024;

public class LAB_1 {
    public static void main(String[] args) {
        int decimal_A = 20;         //integer literals Decimal Base10 (0-9)
        int Octal_A = 0146;         //octal literals Base8 (0-7)
        int hexadecimal_A = 0X123FACE;  //hexadecimal literals Base 16 (0-9,A,B,C,D,E,F)
        int binary_A = 01010;       // Binary literals Base 0 and 1

        // Flot Point literals

        double B = 23.56; //double literals decimal 0-9

        // char literals

        char C = 'M';  // literals in single quotation
        char D = 062;  // char literal as integral literal
        char E = '\u0061';  // as unicode representation u0061 is present a.
        char F = '\n';    // Escape Sequence

        // String Literals
        String G = "MY NAME";  // String literals
        String H = "SUN is Rising";

        // boolean literals

        boolean I = true;
        boolean J = false;

        //printing value

        System.out.println(decimal_A);
        System.out.println(Octal_A);
        System.out.println(hexadecimal_A);
        System.out.println(binary_A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
        System.out.println(H);
        System.out.println(I);
        System.out.println(J);
    }
}

