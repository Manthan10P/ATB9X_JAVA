package OCT.LAB028102024_String;

import java.io.PrintStream;
import java.util.Locale;

public class LAB_1 {
    public static void main(String[] args) {

      String str = "Ahmedabad";
      String str2 = "AHMEDABAD";
      String str1 = "Gujarat";
      String str3 = "GUJARAT";
      System.out.println(str.length());
      System.out.println(str1.length());
      System.out.println(str.equals(str1));
      System.out.println(str.equals(str2));
      System.out.println(str.compareTo(str2));
      System.out.println(str2.toLowerCase(Locale.of(str)));
      System.out.println(str.compareTo(str1));
      System.out.println(str.compareToIgnoreCase(str1));
      System.out.println(str3.substring(3));
      System.out.println(str3.substring(4,7));
      System.out.println(str2.replace("AHMEDABAD","Mehsana"));

    }
}
