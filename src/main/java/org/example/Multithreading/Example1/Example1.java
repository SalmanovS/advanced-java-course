package org.example.Multithreading.Example1;

import java.util.ArrayList;

public class Example1 {

    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();

        System.out.println(Example1.list);
    }
}

class Thread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){

            Example1.list.add(i);

        }
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
    for (int i = 1; i <=5 ; i++){
        Example1.list.add(i * 100);

    }
    }
}