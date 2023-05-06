package multithreading;

/**
 * inter communication thread
 * threa min,max, intrupted, deman illed, thread class method
 * wait and notify is not thread class method
 */
public class ProducerConsumner {

    int num;

    boolean flag=true;
    public synchronized void getNum() {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get: " + num);
        flag=true;
        notify();

    }

    public synchronized void setNum(int num) {
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.num = num;
        System.out.println("Set: " + num);
        flag=false;
        notify();
    }

}

class Producer implements Runnable {

    ProducerConsumner producerConsumner;

    public Producer(ProducerConsumner producerConsumner) {
        this.producerConsumner = producerConsumner;
//        Thread t1=new Thread(this);
//        t1.start();
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            producerConsumner.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}

class Consumer implements Runnable {
    ProducerConsumner producerConsumner;
    public Consumer(ProducerConsumner producerConsumner) {
        this.producerConsumner = producerConsumner;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {


        while (true) {
            producerConsumner.getNum();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class Main {
    public static void main(String[] args) {
        ProducerConsumner producerConsumner = new ProducerConsumner();
        Producer producer = new Producer(producerConsumner);
        Thread t1 = new Thread(producer);
        t1.start();
        Consumer consumer = new Consumer(producerConsumner);
    }
}