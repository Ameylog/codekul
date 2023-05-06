package multithreading;

/***
 * stop the execiution current thread and give priority to other thread
 *  It is not grantee (because of thread shedule)
 */
public class YeildDemo {
    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.yield();
                for (int i = 0; i <=50 ; i++) {
                    System.out.println("i am Thread 1");
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=50 ; i++) {
                    System.out.println("I am thread 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
