package org.example.Multithreading.Example1;

public class Synchronized1 {
    final static Object lock = new Object();
    static int customer = 0;
   void queue(){
       synchronized (lock) {
           customer++;
           System.out.println("Customer number " + customer + ", please come to window number 1");
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            new Thread(new MyRunnable()).start();
        }
    }
}


class MyRunnable implements Runnable {

    @Override
    public void run() {
        new Synchronized1().queue();
    }
}
