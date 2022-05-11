package Drone;

public class Point{
    private int x;
    private int y;
    private int z;

    Point(){
        x =0;
        y =0;
        z =0;
    }
    Point(int x , int y , int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public double getDistance(Point other){
        return Math.sqrt(Math.pow(this.x - other.getX(),2) + Math.pow(this.y - other.getY(),2)+ Math.pow(this.z - other.getZ(),2));
    }
}