package demo.FatherAndSon;

public class Son extends Father {
    void SonEat()
    {
        System.out.println("SonEat");
    }

    @Override
    void eat() {
        System.out.println("sonEatOverrideFather");
    }
}
