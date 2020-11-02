package dataStructure.Comparable;

public class Person implements java.lang.Comparable<Person> {
    String name;
    int length;

    public Person(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Person o) {
        return this.length-o.length;
    }
}
