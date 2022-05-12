package Bereshit;

public class myMoon {
    public Point center;
    private double radius = 1737000.5; // in meters
    private double circumference  = 10917000; // in meters
    private double mass = 7.35* Math.pow(10.0,22.0);
    myMoon(){
        center = new Point();
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }
    public double calculateGravityForce(double distance){
        //by formula 6.67 is g constant - > m/s/s
        return ((6.67* Math.pow(10.0,-11.0)*this.mass)/Math.pow(distance,2));
    }
}
