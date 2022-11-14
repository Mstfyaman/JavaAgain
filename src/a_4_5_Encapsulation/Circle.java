package a_4_5_Encapsulation;

public class Circle {

    public double radius;
    private final  double PI = 3.14;



    public Circle(double radius){
      this.radius=radius;
    }


    public double getRadius(){
        return this.radius;
    }

    public double circleAres(){
        return  PI*this.radius*this.radius;
    }

    public static double circleArea(double radius) {
        return   Math.PI*radius*radius;
    }


}
