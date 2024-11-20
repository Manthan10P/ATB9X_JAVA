package NOV.LAB18112024_Exception.LAB02;

//ClassNotFoundException: This Exception is raised when we try to access a class whose definition is not found
//RuntimeException: This represents an exception that occurs during runtime.

import static java.lang.Class.forName;

public class ClassNotFound {
    public static void main(String[] args) {
        try {
            class.ForName("Class1") ;
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("ClassNotFoundException");
        }
    }
}

