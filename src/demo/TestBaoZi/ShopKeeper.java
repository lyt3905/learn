package demo.TestBaoZi;

public class ShopKeeper implements Runnable{
    BaoZi baoZi;
    int i=0;

    public ShopKeeper(BaoZi baoZi) {
        this.baoZi = baoZi;
    }
    @Override
    public void run() {
        while (true)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (baoZi){
                if(baoZi.cunzai==true)
                {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    baoZi.xian="包子馅种类"+i;
                    baoZi.pi="包子皮种类"+i;
                    baoZi.cunzai=true;
                    System.out.println("我做出了"+baoZi.xian+"  "+baoZi.pi+"的包子");
                    baoZi.notify();
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
