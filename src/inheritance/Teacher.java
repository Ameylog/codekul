package inheritance;

public class Teacher {       //base class, super class, parent class
    int id;
    String name;
    String address;

}
class MathTeacher extends Teacher{  // derived class,sub class,child class

    public static void main(String[] args) {

        MathTeacher obj= new MathTeacher();
        obj.id=456;
        obj.name="Amey";
        obj.address="Pune";

        System.out.println("id:-"+obj.id +" name:- "+obj.name + " adresss:-"+obj.address);
    }
}

class PhysicsTeacher extends MathTeacher{

    public static void main(String[] args) {
        PhysicsTeacher obj=new PhysicsTeacher();
        obj.id=456;
        obj.name="Amol";
        obj.address="Mumbai";
        System.out.println("id:-"+obj.id+" name:-"+obj.name+" address:-"+obj.address);
    }
}
class BioTeacher extends MathTeacher{

    public static void main(String[] args) {
    BioTeacher obj = new BioTeacher();
    obj.id=789;
    obj.name="Ankur";
    obj.address="Nagpur";

        System.out.println("id:-"+obj.id + " name:- "+obj.name+" address:- "+ obj.address);

    }
}

