package demo.ThreadPool;

public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        while (true)System.out.println(Thread.currentThread().getName()+"你是zhu");

    }
}
