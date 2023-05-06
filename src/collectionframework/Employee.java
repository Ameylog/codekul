package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

    int id;
    String name;
    String address;

    Employee(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;

    }
//    public static int employeeComparator(Employee e1, Employee e2){
//        if(e1.id > e2.id) {
//            return 0;
//        }
//        return 1;
//    }

    public static void main(String[] args) {

        Employee obj1=new Employee(1,"Amey","Pune");

        Employee obj2=new Employee(2,"Amol","Pune");
        Employee obj3=new Employee(3,"Ankur","Mumbai");
        Employee obj4=new Employee(1,"Amey","Pune");

        List<Employee>list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
//        list.sort(Employee::employeeComparator);

        list.forEach(i->{
            System.out.println(i.id+" "+i.name+" "+i.address);
        });
    }
}
