package polymorphism;

/**
 * method overriding -> if two classes have same method with same signature
 * <p>
 * advantage - we are again implementing parent class method in child
 */

/** run time polymorphism ,dynamic binding ,late binding */

public class MethodOverriden {

    public void sound() {
        System.out.println("In Animal sound");
    }
}

class Cat extends MethodOverriden{
    public static void main(String[] args) {
//        Cat obj = new Cat();
//        obj.sound();

        MethodOverriden obj2=new Cat();

        // reference       // object
        obj2.sound();
    }
    public void sound(){

        System.out.println("In cat sound");
    }

}

