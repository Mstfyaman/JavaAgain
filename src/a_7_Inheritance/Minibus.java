package a_7_Inheritance;

public class Minibus extends Vehicle{

    // Minibus is a Vehicle

    int seat;

    public void using(){
        System.out.println(color+" "+type+" "+seat+" yolcu tasir");
    }


    public String toString() {
        return "Minibus{" +
                "seat=" + seat +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

