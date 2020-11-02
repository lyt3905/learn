package demo.D10_RecursionPrint;

import java.io.File;
import java.io.IOException;

public class RecursionPrint {
    public static void main(String[] args) throws IOException {
        File abc=new File("abc");

        getAllFiles(abc);

    }
    static void getAllFiles(File file){

        if(file.isDirectory()){
            System.out.println(file);
            File[] files = file.listFiles();

            for (int i = 0; i <files.length ; i++) {
                getAllFiles(files[i]);
            }
        }else {
            System.out.println(file);
        }
    }
}
