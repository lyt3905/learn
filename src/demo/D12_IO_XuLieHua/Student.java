package demo.D12_IO_XuLieHua;

import java.io.Serializable;

public class Student implements Serializable {
    int id=0;
    String name="";
    boolean isboy=true;
    static final long serialVersionUID = 42L;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isboy=" + isboy +
                '}';
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, boolean isboy) {
        this.id = id;
        this.name = name;
        this.isboy = isboy;
    }
}
