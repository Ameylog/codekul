package exceptionhandling;

/**
 *  e.printStackTrace() --> print the exception with description and error in line
 * <p>
 * e.getMessage() -->> description message show
 * <p>
 * System.out.println(e) --> excption and  descrption
 */
public class MethodToPrintException {
    public static void main(String[] args) {
        try{
            int a=100; int b=0;  int c;
            c=a/b;
            System.out.println(c);

        }catch(ArithmeticException e){
//            System.out.println(e);
            e.printStackTrace();

//          System.out.println(e.getMessage());



        }
    }
}
