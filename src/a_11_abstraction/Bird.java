package a_11_abstraction;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kuslar böcek yerler");
    }

    @Override
    public void move() {
        System.out.println("kuslar ucarlar");
    }
}
class  parrot extends Bird{

    public parrot(String name) {
        super(name);
    }

    // burası torun class olduğundan
    // override gerektirmez.

}
