package demo.TestBaoZi;

public class TestBaoZi {
    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi();
        new Thread(new Buyer(baoZi)).start();
        new Thread(new ShopKeeper(baoZi)).start();

    }
}
