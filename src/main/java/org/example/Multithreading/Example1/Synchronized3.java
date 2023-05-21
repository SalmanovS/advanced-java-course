package org.example.Multithreading.Example1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Synchronized3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Mobile());
        Thread thread2 = new Thread(new Skype());
        Thread thread3 = new Thread(new Whatsapp());
        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class Call {
    private static Lock lock = new ReentrantLock();

    public static void mobileCall(){
        lock.lock();
        try {

            System.out.println("Mobile start");
            Thread.sleep(3000);
            System.out.println("Mobile ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }

    }

    public static void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype starts");
            Thread.sleep(5000);
            System.out.println("Skype ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }

    public static void whatsAppCall(){
        lock.lock();
        try {
            System.out.println("WhatsApp starts");
            Thread.sleep(7000);
            System.out.println("WhatsApp ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
}

class Mobile implements Runnable{

    @Override
    public void run() {
       Call.mobileCall();
    }
}

class Skype implements Runnable{

    @Override
    public void run() {
        Call.skypeCall();
    }
}
class Whatsapp implements Runnable{

    @Override
    public void run() {
       Call.whatsAppCall();
    }
}

