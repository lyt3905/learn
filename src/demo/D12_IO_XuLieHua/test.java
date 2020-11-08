package demo.D12_IO_XuLieHua;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> l=new LinkedList<>();
        l.add(new Student(001,"李小龙",true));
        l.add(new Student(002,"李小虎",false));
        l.add(new Student(003,"李小雀",false));
        l.add(new Student(004,"李小武",true));
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("testSerializable"));
        oos.writeObject(l);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("testSerializable"));
        Object o = ois.readObject();
        LinkedList<Student> ll=(LinkedList<Student>)o;
        for(Student s:ll){
            System.out.println(s);
        }

    }
}
