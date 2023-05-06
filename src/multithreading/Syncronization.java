package multithreading;

// use for lock the method
// synchronization block - use to selected method synchronized
public class Syncronization {

    //int num;
    static int num;

    public  void increment() {
        synchronized (Syncronization.class){
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Syncronization obj = new Syncronization();
        Syncronization obj1=new Syncronization();

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj1.increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("num:-" + num);
    }
}
