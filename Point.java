package Bereshit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Point{

    private myCordinate x;
    private myCordinate y;
    private myCordinate z;
    Point(){
        this.x = new myCordinate("x",0.0) ;
        this.y = new myCordinate("y",0.0) ;
        this.z = new myCordinate("z",0.0) ;

    }
    Point(double x , double y , double z){
        this.x = new myCordinate("x",x) ;
        this.y = new myCordinate("y",y) ;
        this.z = new myCordinate("z",z) ;
    }
    public double getCord(String name){
        if (Objects.equals(name, "x")){
            return this.getX();
        }else if (Objects.equals(name, "y")){
            return this.getY();
        }else{
            return this.getZ();
        }
    }
    public double getX() {
        return x.getValue();
    }

    public double getY() {
        return y.getValue();
    }

    public double getZ() {
        return z.getValue();
    }
    public double getDistanceAxie(myCordinate cord){
        return this.getCord(cord.getName());
    }
    public double getDistance(Point other){
        return Math.sqrt(Math.pow(this.x.getValue() - other.getX(),2) + Math.pow(this.y.getValue() - other.getY(),2)+ Math.pow(this.z.getValue() - other.getZ(),2));
    }
}