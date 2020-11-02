package demo.ThreadPool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        while (true)System.out.println(Thread.currentThread().getName()+"你是真的真的真的真的很不错");
    }
}
