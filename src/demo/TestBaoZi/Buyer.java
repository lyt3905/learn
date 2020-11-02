package demo.TestBaoZi;

public class Buyer implements Runnable{
    BaoZi baoZi;
    int i=0;
    public Buyer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(baoZi){
                if (baoZi.cunzai==true){
                    System.out.println("我吃掉了"+baoZi.xian+"  "+baoZi.pi);
                    System.out.println("---------------------------");
                    baoZi.cunzai=false;
                    baoZi.notify();
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {

                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            i++;
        }
    }
}
