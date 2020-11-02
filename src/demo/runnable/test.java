package demo.runnable;

public class test {
    public static void main(String[] args) {
        mythread mt1=new mythread();
        new Thread(mt1).start();//0
        String name =Thread.currentThread().getName();
        for (int i = 0; i <100 ; i++)
            System.out.println(name+"-->"+i);//main
        new Thread(){
            @Override
            public void run() {
                String name =Thread.currentThread().getName();
                for (int i = 0; i <100 ; i++)
                    System.out.println(name+"-->"+i);
            }
        }.start();//1
        new Thread(new Runnable() {
            @Override
            public void run() {
                String name =Thread.currentThread().getName();
                for (int i = 0; i <100 ; i++)
                    System.out.println(name+"-->"+i);
            }
        }).start();//2
    }
}
