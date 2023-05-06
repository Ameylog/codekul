package collectionframework;


/**  draw back
 *
 * All method are Synchronise
 * and size are double
 */

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(40);
        vector.add(70);
        vector.add(90);
        System.out.println(vector);

        Vector<Integer>vector1=new Vector<>();

        System.out.println(vector1.capacity());
}

}
