package a_7_Inheritance;

public class Truck extends Vehicle{

    // Truck is a Vehicle

    int carryingCapacity;


    public void carrying () {
        System.out.println(color+" "+type+" "+carryingCapacity+" yük tasir");
    }


    public String toString() {
        return "Truck{" +
                "carryingCapacity=" + carryingCapacity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
