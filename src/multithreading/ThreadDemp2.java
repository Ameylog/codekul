package multithreading;

import java.lang.*;
/**
 * //or thread implement through runnable interface
 */
public class ThreadDemp2  implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Created");

    }

    public static void main(String[] args) {
        ThreadDemp2 obj=new ThreadDemp2();

        Thread th=new Thread(obj);
        th.start();
    }
}
