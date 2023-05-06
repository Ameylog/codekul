package abstraction.abstractdemo;


public class Cricket extends AbsSport{

    public void show(){
        System.out.println("This is a display");
    }

    public static void main(String[] args) {
        Cricket obj=new Cricket();
        obj.gym();
        obj.show();
    }
}
