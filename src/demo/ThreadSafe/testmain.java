package demo.ThreadSafe;

public class testmain {
    public static void main(String[] args) {
        RunnableSafe rs=new RunnableSafe();
        new Thread(rs).start();
        new Thread(rs).start();
        new Thread(rs).start();
    }
}
