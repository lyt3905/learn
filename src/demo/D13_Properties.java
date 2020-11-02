package demo;

import java.io.BufferedInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class D13_Properties {
    public static void main(String[] args) throws IOException {
        Properties pr=new Properties();
        FileReader fr=new FileReader("a");
        pr.load(fr);
        Set<String> keys = pr.stringPropertyNames();
        for (String key : keys) {
            String value = pr.getProperty(key);
            System.out.println(key+" = " + value);
        }


        /*        FileWriter fw=new FileWriter("a");
        Properties pr=new Properties();
        pr.setProperty("雍容高贵","155");
        pr.setProperty("非法拘禁","165");
        pr.setProperty("菜油烧熟","176");

        pr.store(fw,"save data");
        pr.clear();*/
    }
}
