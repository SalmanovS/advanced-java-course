package org.example.Multithreading.Example1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {

    public static void main(String[] args) {
        try(ExecutorService executorService = Executors.newFixedThreadPool(4)) {
            for (int i = 0; i < 10; i++) {
                executorService.execute(new Pool());
            }
            executorService.shutdown();
        }

    }
}

class Pool implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}
