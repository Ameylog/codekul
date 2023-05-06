package abstraction.interfacedemo;

public class Main {
    public static void getNoise(Animal animal){
        animal.makeNoise();
    }

    public static void main(String[] args) {
        Main obj=new Main();
        Cat cd=new Cat();
        Dog dc=new Dog();
        obj.getNoise(cd);
        obj.getNoise(dc);
    }



}
