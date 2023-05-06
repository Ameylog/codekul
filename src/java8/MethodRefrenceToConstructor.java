package java8;

public class MethodRefrenceToConstructor {

    MethodRefrenceToConstructor() {

        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        // refer
        MyInterface3 myInterface3=MethodRefrenceToConstructor::new;
       
        //callinf
        myInterface3.methodRefrenecToConstructor();

    }
}

interface MyInterface3{

    MethodRefrenceToConstructor methodRefrenecToConstructor();

}