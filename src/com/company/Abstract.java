package com.company;

/**
 * --> A class which contain the abstract keyward in the declaration is called
 * abstract class
 *
 * --> note
 * 1. we can't create object for abstract class.
 * 2. It may or may not contain abstract method.
 * 3. It can have abstract and non abstract method.
 * 4.TO use abstract class partial implementation then we should declare a class as a abstact .
 * 5.to use an abstract class ,you have to inherit if from sub class.
 *
 */
abstract class Abstract {
    public abstract void message();
}
class Demo2 extends Abstract{
    public void message(){
        System.out.println("Hey........");
    }
}
class Demo3 extends Abstract{
    public void message(){
        System.out.println("Waooo........");
    }
}
class Demo{
    public static void main(String[] args) {
        Demo2 r =new Demo2();
        Demo3 d= new Demo3();
        r.message();
        d.message();

    }
}
