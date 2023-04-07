package org.example.Multithreading.Example1;

public class Ex2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Thread thread2 = new Thread(new MyRunnable2());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Finish!!!");
    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("MyRunnable1 thread");
        System.out.println("Start " + Thread.currentThread().getName() + " waiting for 5 seconds");
        try {
            Thread.sleep(5000);
            System.out.println("End " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("MyRunnable2 thread");
        System.out.println("Start " + Thread.currentThread().getName() + " waiting for 8 seconds");
        try {
            Thread.sleep(8000);
            System.out.println("End " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}