package statickeyward;

/**
 * static:--
 *        1. Variable --> class variable can be static . local variable not be static
 *
 *        2. Method --> without creating object we can execute the method
 *        3. Block  --> Static variable initialize
 *        4. Nested class
 *
 * main use:- memory management( memory efficiency increase)
 *
 *
 *
 * */
public class StaticDemo {

    int empId;
    String empName;
    static String companyName;  // static variable - not change value


    static {                    // static block - initialize static member
        companyName="ABC";
    }

    static void show(){
        System.out.println("IT is static method");
    }

    public static void main(String[] args) {
        System.out.println("It is main function");
        StaticDemo obj=new StaticDemo();
        obj.empId=1;
        obj.empName="Akash";
        show();

        StaticDemo obj1=new StaticDemo();
        obj1.empId=2;
        obj1.empName="Aman";

        System.out.println(obj.empId+" "+obj.empName+" "+companyName);
        System.out.println(obj1.empId+" "+obj1.empName+" "+companyName);
    }
}
