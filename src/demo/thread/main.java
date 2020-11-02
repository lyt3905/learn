package demo.thread;

public class main {
    public static void main(String[] args) {
        mythread mt=new mythread();
        mt.setName("葫芦岛吴奇隆");
        mt.start();
        new mythread("皮卡丘").start();


    }
}
