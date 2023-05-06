package java8;

//Lambda (Anonymous function)-> 1.for Reduce code
 //                             2.
// used only functional interface
// functional interface contain object class methods ,or default method.

import java.util.ArrayList;
import java.util.List;

public class LambadaExpressionDemo {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);

        lst.forEach(s->{
            System.out.println(s);
        });


//        MyInterface myInterface=new MyInterface() {
//            @Override
//            public void mess() {
//                System.out.println("hellow");
//            }
//        };

        // optimise
        MyInterface myInterface=()-> {
                System.out.println("Hello");
            };

        myInterface.mess();
    }

}
