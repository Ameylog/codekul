package multithreading;

import  java.lang.*;

/**
 * Thread cannot be invoked again.If invoked 2nd time its give exception
 */
public class ThreadDemo extends Thread {
    public void run(){
        System.out.println("Thread test");

        System.out.println("thread name:- "+ currentThread().getName()); // Give the current thread name
        System.out.println("It is demon thread:- "+Thread.currentThread().isDaemon());

        System.out.println("Prioirty:- "+ Thread.currentThread().getPriority());  // Inherit priority from parent
    }

    public static void main(String[] args) {
        ThreadDemo t=new ThreadDemo();
        System.out.println("Main thread");
        t.setDaemon(true); // always create before start() method .//other wise throws exception
        // we cannot make main thread as demon thread because main thread run always first
        t.start();

        System.out.println("Thread is alliveL:-"+ t.isAlive());  // checked the thread is alive (return true) or not allive(false return)
//       t.currentThread().setName("Amey");  /// set current thread name
        System.out.println("thread name: "+ t.currentThread().getName()); // Give the current thread name

//        System.out.println(t.isDaemon()); /// isDaemon is check the thread is running baground or not

        t.setPriority(10);
    }





}
