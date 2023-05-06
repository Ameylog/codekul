package abstraction.interfacedemo;

public class Football implements Sports {

    public void show(){
        System.out.println("IN order");
    }

    public static void main(String[] args) {
        Football obj=new Football();
        obj.show();
    }
}
