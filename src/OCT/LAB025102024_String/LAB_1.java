package OCT.LAB025102024_String;

import java.nio.Buffer;
import java.util.Arrays;

public class LAB_1 {
    public static void main(String[] args) {

        String str = "Sun is rising ";
        System.out.println(str);
        String str1 = new String("Mood is rising in the evening");
        System.out.println(str1);
        StringBuffer str2 = new StringBuffer("The Boss is always Right" );
        System.out.println(str2);
        StringBuilder str3 = new StringBuilder("This laptop have updated version of window ");
        System.out.println(str3);
        String str4 = "Sachin";
        String  str5 = str4.concat("tendulkar");
        System.out.println(str5);

        String str6 = "Manthan";
        String str7 = "Panchal";
        String sum  = str6 + str7 ;
        System.out.println("The name is  "  +  sum);

        char    character[] = {'A', 'B', 'C'};
        String FirstString = new String(character);
        String SecondString = new String(FirstString);
        System.out.println(SecondString);





    }

}
