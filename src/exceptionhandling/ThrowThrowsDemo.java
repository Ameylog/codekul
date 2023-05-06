package exceptionhandling;

/** Imp throw vs throws
 * throw -> is throw the exception and handled exception  (always inside method)
 *       -> declare only one exception at time.
 *
 * throws -> declared exception not handle.              (with method signiture )
 *
 *
 * exception handle -> for working the next code.
 */
public class ThrowThrowsDemo {
    public static void main(String[] args) throws Exception {
        int i=10;

        if(i>=18){
            System.out.println("You can give vote");
        }
        else{
            throw new Exception("you can not vote");
        }
        System.out.println("Exit");

    }
}
/**
 *            throw                                          throws
 *
 * 1. throw is used to throw the exception explicitly   1. declare exception
 *
 * 2. throw is used in method                           2. throws is used with method signature
 *
 * 3. you can throw only one exception at a time        3. you can declare multiple exception at a time
 *
 * 4. throw is used with instance of class              4. throws is used with class
 *
 *
 */