package com.company;

/**
 * <p> this keywoard </p>
 *   It is refer the current object of inside a method or constructor
 *   used when local and instance variable ar same
 */


public class A{

    int a;  // instance variable   ///global variable
    A(int a){
        this.a=a;    // when instance and local variable tha is a is same
    }
    void show(){
        System.out.println(a);
    }
    public static void main(String[] args) {

        A r=new A(60);
        r.show();
    }
}


//public class A{
//
//    A(){                /// default constructor
//        System.out.println("This is a constructor");
//    }
//    A(int a){
//        this();      /// called the default constructor
//        System.out.print(a);
//    }
//
//    public static void main(String[] args) {
//        A r=new A(4);
//
//    }
//}
//
