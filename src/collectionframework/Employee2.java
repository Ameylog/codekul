package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee2 implements Comparable<Employee2>{

    int id;
    String name;
    String address;

    Employee2(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;

    }

    public static void main(String[] args) {

        Employee2 obj1=new Employee2(1,"Amey","Pune");
        Employee2 obj2=new Employee2(2,"Amol","Pune");
        Employee2 obj3=new Employee2(3,"Ankur","Mumbai");


        List<Employee2> list =new ArrayList<>();
        list.add(obj1);
        list.add(obj3);
        list.add(obj2);

//        list.sort(Employee::employeeComparator);

        Collections.sort(list);

        list.forEach(i->{
            System.out.println(i.id+" "+i.name+" "+i.address);
        });
    }

    /// For sorting Intergert Comparatable Method
     public int compareTo(Employee2 o) {
        if(this.id==o.id){
            return 0;
        } else if (this.id>o.id) {
            return 1;
        }else{
            return -1;
        }
    }

    // For Sorting  String Comparable Method
//    public int compareTo(Employee2 o){
//        return this.name.compareTo(o.name);
//    }
//
}
