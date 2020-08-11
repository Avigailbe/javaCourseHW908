package home_work908;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Thread> threadList = new ArrayList<>();
        ThreadPool newThread = new ThreadPool();
        for (int i = 0; i < 2000; i++) {
            Thread t1 = new Thread(newThread, "thread #" + i);
            System.out.println("Thread thread #" + i +" is alive");
            threadList.add(t1);
            newThread.setI(i);
            newThread.increment();
            t1.start();

            }

             //Thread.sleep(1000);
    }
}