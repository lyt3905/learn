package demo.FatherAndSon;
//父类引用指向子类对象的时候，只能使用父类拥有的方法，因为创建的对象是一个子类对象。
public class FatherAndSonTest {
    public static void main(String[] args) {
        Father f=new Son();
        f.eat();

    }
}
