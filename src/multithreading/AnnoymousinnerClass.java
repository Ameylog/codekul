package multithreading;

///
//inter thread communication
//thread methods

public class AnnoymousinnerClass {
    public static void main(String[] args) {

       // Myinterface myinterface=new Myinterface() {
//            @Override
//            public int show() {
//                return 10;
//            }
//
//            @Override
//            public int display() {
//                return 5;
//            }
//        };
//
//        System.out.println(myinterface.show());
//        System.out.println(myinterface.display());

            Myinterface myinterface= () -> {
                return 10; };

        System.out.println(myinterface.show());

    }


}

interface Myinterface{
    int show();   /// declred



}
