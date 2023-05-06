package com.company;

public class Inheritance {
    int id;
    int age;
    String address;
}

class Student extends Inheritance{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.id=56;
        obj.age=16;
        obj.address="Pune";
        System.out.println("id:- "+obj.id +" name:- "+obj.age+" address:- "+obj.address);
    }

}
class Student1 extends Student{
    public static void main(String[] args) {
        Student1 obj=new Student1();
        obj.id=765;
        obj.age=35;
        obj.address="Mumbai";
        System.out.println("id:- "+ obj.id +" age:-"+obj.age+" address:- "+obj.address);
    }

}

class Student2 extends Student{
    public static void main(String[] args) {
        Student2 obj=new Student2();
        obj.id=123;
        obj.age=24;
        obj.address="nagpur";
        System.out.println("id:- "+ obj.id +" age:-"+obj.age+" address:- "+obj.address);


    }
}

