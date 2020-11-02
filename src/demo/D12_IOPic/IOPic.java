package demo.D12_IOPic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOPic {
    public static void main(String[] args) throws IOException {
        long s1=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("a.png");
        FileOutputStream fos=new FileOutputStream("b.jpg");
        byte[] bytes=new byte[9096];
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes);
        }

        fis.close();
        fos.close();
        long s2=System.currentTimeMillis();
        System.out.println("运行时间为"+(s2-s1)+"毫秒");
        System.out.println(s1);
        System.out.println("s2 = " + s2);
    }
}
