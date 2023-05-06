package java8;

public class MethodRefrenceToInstance {


//    method ref to instance method

    public static void main(String[] args) {
        MethodRefrenceToInstance obj = new MethodRefrenceToInstance();

        //refer
        MyInterface4 myInterface4 = obj::display;
//        calling
        myInterface4.show();

    }

    public void display(){
        System.out.println("in display");
    }
}
interface MyInterface4{

    void show();
}