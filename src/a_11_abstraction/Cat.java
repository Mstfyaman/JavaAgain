package a_11_abstraction;

public class Cat extends Animal{ // concrete


    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kediler et yerler");
    }

    @Override
    public void move() {
        System.out.println("kediler iyi koşucuu");
    }
}
