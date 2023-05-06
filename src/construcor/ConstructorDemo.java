package construcor;

/**
 * constructor -> it is special type function
 * which invoke automatically when you create object of class
 *
 * Rules ->
 * 1. you class name and constructor should be same
 * 2. there should not be explicit return type to constructor
 * 3. static, synchronized,final keywords are not allowed
 * <p>
 * types ->
 * 1. default
 * 2. parameter
 * <p>
 * use - initialize variables to their default values
 */
public class ConstructorDemo {


    void show() {
    }
    ConstructorDemo() {                  /// Default constructor  (only one default constructor allow)
        System.out.println("Hello ");
    }

    public ConstructorDemo(int i) {       /// Parameterize constructor  ( multiple parameter can allow)
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(7);

    }
}
