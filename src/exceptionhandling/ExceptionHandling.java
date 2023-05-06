package exceptionhandling;

/**  IMP ask in interview
 *
 * we cannot handle error only handle exception that why not write  throwable
 *   we declare exception by throws' keyword.
 *   once's the exception found directly run catch block.
 *   we can write multiple time try catch in catch block.
 *   try finally can write or try catch finally
 *
 *
 *
 * Throwable
 *          Exception    (checked exception)
 *                 - IOException
 *                    - FileNotFoundException
 *                 - SQLException
 *                 - ClassNotFoundException
 *                 - RunTimeException   (unchecked exception)
 *                     - ArithmeticException
 *                     - NullPointerException
 *                     - NumberFormatException
 *                     - IndexOutOfBoundException
 *                              - ArrayIndexOutOfBoundException
 *                              - StringIndexOutOfBoundException
 *          Error -
 *               1.StackOverFlowError
 *               2.OutOfMemoryError
 *               3.AssertionError
 *               4.UnknownError
 * checked and unchecked  and exception handling
 *
 * use ->when calculation work in code .
 */
public class ExceptionHandling {
    public static void main(String[] args) {

        int i=5;
        try{
            int j=i/0;
            System.out.println(i);

            try{
                int arr[]=new int[3];
                arr[0]=1;
                arr[1]=4;
                arr[2]=6;
                arr[3]=2;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}

/** Finally Block
 *
 * Finally, block execute always after the try block.
 * many connection are closed in finally block( database connection,sequel query ,file closed).
 * if any jump statement in try block (or transfer control) then also execute finally block
 *
 * finally block not execute in some case condition-->
 * 1.System.exit()  ->> Jvm close in this case .
 * 2.caution fatal error that causes the process to abort.
 * 3.Due to an exception in finally block .
 * 4.The death of thread.
 */
