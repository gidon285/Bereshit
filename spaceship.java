package Drone;

import java.util.LinkedList;
import java.util.*;
import java.lang.*;

public class spaceship {

    // indexs and oriation: m/s
    // upwardMoment = 0, downwardMoment = 1,frontFacingMoment = 2
    // backwardsFacingMoment = 3 leftFacingMoment = 4 rightFacingMoment = 5
    private List<Integer> Moments;
    private List<Thrusther> thrusters;
    private double mainBurnRate = 0.15;    //liter per sec, 12 liter per m
    private double secondaryBurnRate = 0.009;    //liter per sec 0.6 liter per m
    private int height = 2;
    private int radius = 1;
    private  int fuel = 420; // in kg
    private  int wieght = 165;
    private Point center;

    /**
     * for later uses:
     * acceleration towards the moon  =  6.67*10^-11*7.35*10^22 (G * mass of moon ) / R^2 (R = distance from center of ship to center of moon)
     *  thrusters = one main(430) and 8 sideways(25)
     *  moon from earth - 384 000 km
     *  lunar orbit = 10 000 to 290
     */
    spaceship(){
        Moments = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
        this.thrusters = new ArrayList<>();
        thrusters.add(new mainThruster(0.15));
        for( int i =0; i<7 ; i++){
            thrusters.add(new secondaryThruster(0.009));
        }
        center = new Point();
    }

    public List<Integer> getMoments() {
        return Moments;
    }

    public double getMainBurnRate() {
        return mainBurnRate;
    }

    public double getSecondaryBurnRate() {
        return secondaryBurnRate;
    }

    public List<Thrusther> getThrusters() {
        return thrusters;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }
}
