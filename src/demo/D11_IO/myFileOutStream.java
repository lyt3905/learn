package demo.D11_IO;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class myFileOutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");
        System.out.println("fis.read() = " + fis.read());


        /* FileOutputStream fos=new FileOutputStream("a.txt",true);
        fos.write("YRGG 喜欢 ZHOUJUN".getBytes());
        fos.write("\r\n  ".getBytes());
        fos.write("YRGG 喜欢 ZHOUJUN".getBytes());

        fos.close();
*/


    }
}
