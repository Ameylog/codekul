package thiskeyword;

/**
 * 1 .this keyword is used to refer current class instance variable
 * 2. this keyword is used to invoke current class methods
 * 3. this keyword is used to invoke current class constructor
 * 4. this keyword is used to pass argument in method call
 * 5. this keyword is used to return as an object
 */
public class ThisDemo {

    int id;
    String name;      // class level variable  // instance variable(in java) // global variable //member variable
    String address;

    public void show(int id, String name, String address) {      // member function
        this.id = id;
    }

    public void display() {
        this.show(1, "Awe", "quiet");
    }

    public ThisDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public ThisDemo() {
        this(5, "Ankur", "Nagpur");  /// this() must be first call in constructor
        show(5, "Ankur", "Nagpur");
    }

    public void test(A a) {   // object value "this" passes from test2 method

        System.out.println("In this method");
    }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo(5, "Amey", "Mumbai");
        System.out.println(obj.id + " " + obj.name + " " + obj.address);

    }
}

class A {

    public void test2() {
        ThisDemo obj = new ThisDemo();
        obj.test(this);
    }

    public A() {
    }

    public A test3() {
        return this;
    }

    public static void main(String[] args) {

        A obj = new A();
        obj.test2();
        obj.test2();
    }
}


