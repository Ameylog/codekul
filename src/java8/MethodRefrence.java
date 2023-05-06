package java8;


import java.util.Arrays;
import java.util.List;

/// Method reference to arbitrary type of particular object
public class MethodRefrence {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(1, "Ramesh"), new Student(2, "Rohan"));
        list.forEach(System.out::println);



    }

    static class Student {

        private int id;
        private String name;

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

}
