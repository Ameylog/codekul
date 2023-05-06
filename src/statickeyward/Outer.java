package statickeyward;

/**
 *  static class ( nested class)
 */
public class Outer {

    int i=10;

    static class Inner{
       static int i=20;

    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        System.out.println(outer.i);


        //  access element i in class Inner  when class is not static
       // Inner inner=outer.new Inner();
       //  Inner inner=new Outer().new Inner();        other syntax
        // System.out.println(inner.i);

        // class is static and variable is not static
          // Outer.Inner inner= new Inner();            syntax
         // System.out.println(inner.i);

          // when class is static then diretly access static variable is i

         System.out.println(Inner.i);

    }
}
