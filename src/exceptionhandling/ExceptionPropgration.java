package exceptionhandling;

/**
 * Exception Propagation(carry forward) ->> means one exception carry forward to another  method. when calling first method to another method
 *
 */
public class ExceptionPropgration {


        public void a(){
            int i=10/0;
        }
        public void b(){
            a();
        }
        public void c(){
            try{
                b();
            }catch (Exception e){
               e.printStackTrace();
            }
            System.out.println("Hii");

        }

    public static void main(String[] args) {
            ExceptionPropgration obj=new ExceptionPropgration();
            obj.c();
//        System.out.println("Hii");
    }
}
