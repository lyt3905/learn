package demo.D12_tranCharSet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class test {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("tran.txt"),"gbk");
        osw.write("我的未来式有无做主");
        osw.flush();
        osw.close();
    }
}
