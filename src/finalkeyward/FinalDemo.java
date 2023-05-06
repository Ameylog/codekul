package finalkeyward;
/**
    Final - variable ->> cannot change the value
            method -->> Cannot override
            class -->> cannot inherited
 */
public class FinalDemo {

    int i=10;
    final int TEST=15;
     public void display(){
         int i=35;
        System.out.println(TEST);

    }
    class A{

    }

    public static void main(String[] args) {
        FinalDemo obj=new FinalDemo();
        obj.display();
        System.out.println(obj.TEST);

    }
}

class C extends FinalDemo{
    public void display(){
        super.display();
    }
}
/**
 * 1. if you declare final variable then you cannot reassign value
 * 2. if you declare final method then you cannot override the method
 * 3. if you declare final class then you cannot inherit that class
 */