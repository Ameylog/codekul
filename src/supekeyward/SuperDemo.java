package supekeyward;
/**
 * super - it is used to refer immediate parent class variable
 *         it is used to invoke immediate parent class method
 *         it is used to invoke parent class constructor
 */
public class SuperDemo {          //by default every class extends object class

   int i=10;
    public SuperDemo(){
        System.out.println("This is constructor");
    }

    public SuperDemo(int i){
        System.out.println("This is the parametrized constructor");
    }
    void show(){
        System.out.println("Hello welcome to pune");
    }


}
class A extends SuperDemo{

    int i=20;

    public void display(){
        System.out.println(super.i);
        System.out.println(i);
        super.show();                  // invoke the method of parent class
    }
    public A(){
        super(7);                     // invoke the parametrized constructor // super always be the first statement in constructor
        System.out.println("This A child class constructor");   /// we can write only one time super keyword in constructor
    }                                           /// and method having many implement super but different method calling or variable calling


    public static void main(String[] args) {
        A obj=new A();
//        obj.show();
        obj.display();
    }
}
class B extends A{
    int i=30;
     public void show(){
         System.out.println(super.i);
     }
    public static void main(String[] args) {
        B  obj=new B();
        obj.show();
    }
}

