package java8;

/**
 * If any class or interface add other method they affect all class and interface. to avoid affect
 * er declared method as default keyword
 * from the starting of method
 */
public class DefaultAndStatic implements MyInterface2 {

    public static void main(String[] args) {
  DefaultAndStatic obj=new DefaultAndStatic();
    obj.show();
//     MyInterface2.show();
    }

    public void mess() {

    }

}


interface  MyInterface2{
    void mess();

 default void show(){
        System.out.println("in show");
    }
//   static void show(){
//        System.out.println("in show");
//    }

}
