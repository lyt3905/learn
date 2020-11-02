package demo.WaitAndNotify;
//商家线程先执行，然后商家wait（）方法，放弃锁对象，进入等待状态
//随后客人线程获取的cpu的执行权，唤醒商家线程，自己调用wait进入休眠状态，此时放弃了锁对象
//商家线程被唤醒，开始做菜，完成后调用notify方法来唤醒客人线程
//客人线程执行最后的代码。
public class TestWaitAndNotify2 {
    public static void main(String[] args) {
        //因为商家和客人不可能同时执行，所以需要一个锁对象
        Object obj=new Object();

        new Thread(){//商家线程
            @Override
            public void run() {
                synchronized(obj){
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("商家做好了食物，给顾客");

                    obj.notify();
                }
            }
        }.start();
        new Thread( new Runnable(){//客人线程
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(obj){
                    System.out.println("顾客到餐厅点餐");
                    obj.notify();
                        //Thread.sleep(2000);//换用sleep此时没有释放掉obj锁对象，
                        // 因此即使商家线程获取了cpu的执行权也因为无法获取锁对象而无法执行
                        // 只能等待。sleep是属于Thread的方法，用于控制进程
                    try {
                        obj.wait();//wait是obj的方法，是进程间用于通信的。
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("拿到了食物，开始吃饭");
                }
            }
        }).start();


    }

}
