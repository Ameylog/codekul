package collectionframework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * create class object  and  add obj to set
 * adding same data  are print in set
 * But add equals and hashcode  are include then set remove duplicate element
 */
public class StudentDemo {

    int id;
    String name;
    String address;

    public StudentDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDemo that = (StudentDemo) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {

        StudentDemo obj=new StudentDemo(1,"Amol","Pune");
        StudentDemo obj1=new StudentDemo(2,"Ankur","Mumbai");
        StudentDemo obj2 =new StudentDemo(1,"Amol","Pune");

        Set<StudentDemo>studentDemo =new HashSet<>();
        studentDemo.add(obj);
        studentDemo.add(obj1);
        studentDemo.add(obj2);

        studentDemo.forEach(s->
                System.out.println(s.id+" "+s.name+" "+s.address));
        }
}
