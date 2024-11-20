package NOV.LAB18112024_Exception.LAB02;

//ArrayIndexOutOfBoundsException: It is thrown to indicate that an array has been accessed with an illegal index.
// The index is either negative or greater than or equal to the size of the array.

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        try{
            int a[] = new int [5];
            a[6] = 9 ; // access of array

        }
        catch (ArrayIndexOutOfBoundsException e )
        {
            System.out.println("ArrayIndexoutofbounds");
        }
    }
}