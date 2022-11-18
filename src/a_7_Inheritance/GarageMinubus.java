package a_7_Inheritance;

public class GarageMinubus {
    public static void main(String[] args) {

        Minibus minibus = new Minibus();

        minibus.type="Minibus";
        minibus.color="Mavi";
        minibus.seat=14;
        minibus.sellPriceWithTax(50000);

        minibus.using();
        minibus.toString();

    }
}
class GarageTruck{

    public static void main(String[] args) {
        Truck truck = new Truck();

        truck.carryingCapacity=16000;
        truck.type="Kamyon";
        truck.color="kırmızı";
        truck.sellPriceWithTax(120000);

        truck.carrying();
        truck.toString();
    }
}
