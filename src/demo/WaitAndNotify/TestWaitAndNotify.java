package demo.WaitAndNotify;

public class TestWaitAndNotify {
    public static void main(String[] args) {
        //因为商家和客人不可能同时执行，所以需要一个锁对象
        Object obj=new Object();
        new Thread( new Runnable(){
            @Override
            public void run() {

                synchronized(obj){
                System.out.println("顾客到餐厅点餐");
                try {
                    //Thread.sleep(2000);//换用sleep此时没有释放掉obj锁对象，
                    // 因此即使商家线程获取了cpu的执行权也因为无法获取锁对象而无法执行
                    // 只能等待。sleep是属于Thread的方法，用于控制进程
                    obj.wait();//wait是obj的方法，是进程间用于通信的。

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("拿到了食物，开始吃饭");
            }
            }
        }).start();


        new Thread(){
            @Override
            public void run() {
                synchronized(obj){
                    System.out.println("商家做好了食物，给顾客");
                    obj.notify();
                }
            }
        }.start();
    }
}
