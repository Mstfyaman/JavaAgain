package a_13_Polymorphism;

public class Car implements IVehicle{

    @Override
    public void start() {
        System.out.println("Car Start");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop");
    }

    @Override
    public int durmaMesafesi() {
        return 20;
    }
}
