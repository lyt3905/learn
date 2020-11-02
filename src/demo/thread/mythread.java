package demo.thread;

public class mythread extends Thread {
    public mythread(String name) {
        super(name);
    }

    public mythread() {
    }

    @Override
    public void run() {
        String name = getName();

        for (int i = 0; i < 60; i++) {
            System.out.println(name+"--->"+i);
            try {
                sleep(1*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
