package Bereshit;

import java.util.LinkedList;
import java.util.*;
import java.lang.*;

public class spaceship {
    // indexs and oriation: m/s
    // upwardMoment = 0, downwardMoment = 1,frontFacingMoment = 2
    // backwardsFacingMoment = 3 leftFacingMoment = 4 rightFacingMoment = 5
    // main burn rate 0.15 liter per sec, 12 liter per m
    // secondary_burnrate0.009 liter per sec 0.6 liter per m
    // orbit around the moon 1700 m / s
    private List<Integer> Moments;
    private List<secondaryThruster> secondary_Thrusters;
    private Thrusther main_Thruster;
    private int height = 2; // in meters
    private int radius = 1; // in meter
    private double fuel_kg = 420; // in kg
    private double fuel_preecent = 100;
    private int wieght = 165;
    private Point center;

    /**TODO
     * add logic to turning on thrusters
     * for later uses:
     * acceleration towards the moon  =  6.67*10^-11*7.35*10^22 (G * mass of moon ) / R^2 (R = distance from center of ship to center of moon)
     *  thrusters = one main(430) and 8 sideways(25)
     *  moon from earth - 384 000 km
     *  lunar orbit = 10 000 to 290
     */
    
    spaceship(){
        Moments = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
        this.secondary_Thrusters = new ArrayList<>();
        for( int i =0; i<7 ; i++){
            this.secondary_Thrusters.add(new secondaryThruster(25, 0.15));
        }
        this.main_Thruster = new Thrusther(430,0.009);
        this.center = new Point();
    }

    public List<Integer> getMoments() {
        return Moments;
    }

    public List<secondaryThruster> getSecondaryThrusters() {
        return this.secondary_Thrusters;
    }
    public List<Boolean> getSecondaryThrustersStatus() {
        ArrayList<Boolean> ans = new ArrayList<>();
        for (secondaryThruster sec : this.secondary_Thrusters ){
            ans.add(sec.isWorking());
        }
        return ans;
    }
    public void turnMainThruster(boolean flag){
        this.main_Thruster.turnOffOn(flag);
    }
    public void turnSecondaryThruster(int index, boolean flag){
        this.secondary_Thrusters.get(index).turnOffOn(flag);
    }
    public void turnOnSecondaryThrusters(ArrayList<Integer> indexs, boolean flag){
        for(Integer index : indexs){
            this.secondary_Thrusters.get(index).turnOffOn(flag);
        }
    }
    public void decreaseFuel(double precent){
        this.fuel_preecent = fuel_preecent -((precent/ 100.0)*this.fuel_preecent);
    }

    public Thrusther getMainThruster() {
        return main_Thruster;
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
