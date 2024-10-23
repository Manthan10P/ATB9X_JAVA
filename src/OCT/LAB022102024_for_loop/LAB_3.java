package OCT.LAB022102024_for_loop;

public class LAB_3 {
    public static void main(String[] args) {
        int a = 123456;
        int revers = 0;
        for(; a != 0 ; a= a/10) {
            int reminder = a % 10;
            revers = revers * 10 + reminder;
        }
        System.out.println("revers number of 123456  " + revers);

        }


    }

/*
Iteration 1:

number = 1234
remainder = 1234 % 10 = 4
reverse = 0 * 10 + 4 = 0 + 4 = 4
number = 1234 / 10 = 123
Now the value of the number and reverse variable is 123 and 4, respectively.

Iteration 2:

number = 123
remainder = 123 % 10 = 3
reverse = 4 * 10 + 3 = 40 + 3 = 43
number = 123 / 10 = 12
Now the value of the number and reverse variable is 12 and 43, respectively.

Iteration 3:

number = 12
remainder = 12 % 10 = 2
reverse = 43 * 10 + 2 = 430 + 2 = 432
number = 12 / 10 = 1
Now the value of the number and reverse variable is 1 and 432, respectively.

Iteration 4:

number = 1
remainder = 1 % 10 = 1
reverse = 432 * 10 + 1 = 4320 + 1 = 4321
number = 1 / 10 = 0

*/



