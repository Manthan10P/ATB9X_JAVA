package OCT.LAB014102024;

public class LAB_1 {
    public static void main(String[] args) {

        //Type casting is when you assign a value of one primitive data type to another type.
        //Types of casting
        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double

        int my_num = 9;
        double my_double = my_num;    //automatic casting int to double

        System.out.println(my_num);
        System.out.println(my_double);

        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte

        //Narrowing casting must be done manually by placing the type in parentheses () in front of the value

        double my_double1 = 9.18d;
        int my_num1 = (int) my_double1;  //manual casting double to int

        System.out.println(my_double1);
        System.out.println(my_num1);

        //Real Example

        int max_score = 500;
        int real_score = 423;
        float percentage = (float) real_score / max_score * 100.0f;
        System.out.println("actual percentafge is " + percentage);
    }
}
