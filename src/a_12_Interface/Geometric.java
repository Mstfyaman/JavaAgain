package a_12_Interface;

public interface Geometric {

    double getArea();

    default double getPrimeter(){
        return 5.0;
    }

}
class Square implements Geometric{

    double a;

    public Square(double a){
        this.a=a;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
