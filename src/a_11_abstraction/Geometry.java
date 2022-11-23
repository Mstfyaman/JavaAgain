package a_11_abstraction;

public abstract class Geometry {

    String nameOfShape;

    public Geometry(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    abstract  double area();
    abstract String info();

    String getNameOfShape(){
        return nameOfShape;
    }



}
class Circle extends Geometry{

    double radius;

    public Circle(String nameOfShape, double radius) {
        super(nameOfShape);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    String info() {
        return "Name of shape is "+nameOfShape +", Area is "+ area();
    }
}

class plygon extends Geometry{

    public plygon(String nameOfShape) {
        super(nameOfShape);
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    String info() {
        return null;
    }
}
