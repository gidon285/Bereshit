package Bereshit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point{
    private double x;
    private double y;
    private double z;
    Point(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    Point(double x , double y , double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getDistance(Point other){
        return Math.sqrt(Math.pow(this.x - other.getX(),2) + Math.pow(this.y - other.getY(),2)+ Math.pow(this.z - other.getZ(),2));
    }
}