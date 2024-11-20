package NOV.LAB18112024_Exception.LAB02;

//NullPointerException: This exception is raised when referring to the members of a null object.
// Null represents nothing

public class NullPointer {
    public static void main(String[] args) {
        try
        {
            String a = null ;
            System.out.println(a.charAt(0));
        }
        catch (NullPointerException e )
        {
            System.out.println("NUllpointer Exception");
        }
    }
}