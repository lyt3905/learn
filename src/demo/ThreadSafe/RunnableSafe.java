package demo.ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableSafe implements Runnable{
    private int ticket=100;

    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {

           {
                    lock.lock();
                  if(ticket>0){

                      try {
                          Thread.sleep(100);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }

                      System.out.println(Thread.currentThread().getName()+"-->出售第"+ticket+"张");
                      ticket--;
                        }
                  lock.unlock();


            }

        }
    }

}
/*
    public void run() {
        while (true) {
            if(ticket>0){

                System.out.println(Thread.currentThread().getName()+"-->出售第"+ticket+"张");
                ticket--;
            }
        }
    }*/
