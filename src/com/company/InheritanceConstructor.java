package com.company;

import org.w3c.dom.DOMError;

class Base1{
    Base1(){
        System.out.println("Base class Constructor");
    }
    Base1(int x){
        System.out.println("Base overloading constructor");
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("Derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("Derived overloading consructor");
    }

}

class Child extends Derived1{
    Child(){
        System.out.println("child class construcor");
    }
    Child(int x,int y,int z){
        super(x,y);
        System.out.println("child overloading Constructor");

    }
}
public class InheritanceConstructor {

    public static void main(String[] args) {
//        Base1 b=new Base1();

//        Derived1 d=new Derived1(1,4);
        Child c=new Child(7,5,3);


    }

}