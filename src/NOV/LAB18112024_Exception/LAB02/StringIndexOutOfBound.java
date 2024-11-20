package NOV.LAB18112024_Exception.LAB02;

//StringIndexOutOfBoundsException: It is thrown by String class methods to indicate that an index is either
// negative or greater than the size of the string

public class StringIndexOutOfBound {
    public static void main(String[] args) {
        try {
            String a = "This is a Dog"; // length of string
            char c = a.charAt(24); // accessing number of string
            System.out.println(c);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}