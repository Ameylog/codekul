package java8;

public class MethodRefrenceStatic {

    //    method ref to static method
    public static void main(String[] args) {
        MyInterface5 myInterface5 = MethodRefrenceStatic::display;
        myInterface5.show();

    }

    private static void display() {
        System.out.println("in display");
    }


}
interface MyInterface5{
    void show();
}