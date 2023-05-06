package java8;

public class MethodRefrenceToConstructor {

    MethodRefrenceToConstructor() {

        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        MyInterface3 myInterface3=MethodRefrenceToConstructor::new;

    }
}

interface MyInterface3{
    void  show();
}