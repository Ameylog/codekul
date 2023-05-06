package polymorphism;

/**
 * polymorphism - one thing have many actions
 * <p>
 *  method overloading :-
 *if one class have same method name with different number of argument or parameter
 * <p>
 * rules ->
 * 1. changing number of parameter
 * 2. changing datatype
 * <p>
 * advantage - it increase readability of program
 */

/**
   compile time polymorphism ,static binding ,early binding

 */
public class MethodOverloading {

    void display() {
        System.out.println("Hello my name amey");
    }

    void display(int a) {
        System.out.println("Welcome to codeKul");
    }


    static int add(int i) {

        return i;
    }

    static double add(double i, int j) {
        return i + j;
    }


    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(1);

        System.out.println(add(1));
        System.out.println(add(1.0, 5));
    }
}
