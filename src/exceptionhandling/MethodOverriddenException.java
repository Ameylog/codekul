package exceptionhandling;

/**
 * if parent class not declar the exception then child class only declare unchecked exception
 *
 */
public class MethodOverriddenException {
   public void show() throws RuntimeException{
       System.out.println("Its show");
   }
}

class MethodOvrrriden1 extends MethodOverriddenException{

    public void show() throws RuntimeException{
        System.out.println("In show");
    }

    public static void main(String[] args) {
        MethodOvrrriden1 obj=new MethodOvrrriden1();
        obj.show();
    }
}