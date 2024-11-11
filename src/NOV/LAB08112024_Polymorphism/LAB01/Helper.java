package NOV.LAB08112024_Polymorphism.LAB01;

// one person different char

public class Helper {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int sub(int a, int b) {
        return a * b;
    }


    static double add(double a, double b) {
        return a + b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double sub(double a, double b, double c) {
        return a - b;
    }
}
class Helper_1 {
    public static void main(String[] args) {
        System.out.println(Helper.add(8, 6));
        System.out.println(Helper.add(6.7, 6.2));
        System.out.println(Helper.multiply(4, 5));
        System.out.println(Helper.multiply(4.5, 6.3));
        System.out.println(Helper.sub(4, 5));
        System.out.println(Helper.sub(4.5, 6.3, 2.1));

    }
}

