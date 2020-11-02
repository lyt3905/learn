package dataStructure.Comparable;

public class ComparableTest {
    public static void main(String[] args) {
        Person p1=new Person("liu",180);
        Person p2=new Person("li",190);
        System.out.println("p1.compareTo(p2) = " + p1.compareTo(p2));
        System.out.println("p2.compareTo(p1) = " + p2.compareTo(p1));
    }
}
