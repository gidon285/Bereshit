package Bereshit;
import java.util.*;
import java.lang.*;

public class spaceship {
    // indexs and oriation: m/s
    // upwardMoment = 0, downwardMoment = 1,frontFacingMoment = 2
    // backwardsFacingMoment = 3 leftFacingMoment = 4 rightFacingMoment = 5
    // main burn rate 0.15 liter per sec, 12 liter per m
    // secondary_burnrate0.009 liter per sec 0.6 liter per m
    // orbit around the moon 1700 m / s
    private List<secondaryThruster> secondary_Thrusters;
    private Thrusther main_Thruster;
    private Vector center;
    private int height = 2; // in meters
    private int radius = 1; // in meter
    private double wieght = 165;
    private double fuel = 121; // 420 for start in kg, 121 for state
    private double battery = 71.191; // 100 for start in precentage, 71 for state
    private double verticalSpeed = 24.8;
    private double horizontalSpeed = 932;
    private double dist = 181*1000;
    private double angelFromGround = 58.3; // zero is vertical (as in landing)
    private double altitude = 13748; // 2:25:40 (as in the simulation) // https://www.youtube.com/watch?v=JJ0VfRL9AMs
    private double acceleration=0; // Acceleration rate (m/s^2)
    private double dt = 1; // sec
    private double NN = 0.7; // rate[0,1]
    private double time = 0;
    private double mainEngineForce = 430.0;
    private  double secondEngineForce = 25.0;
    private double all_burn = 0.15 + (8*0.009); // 0.15 main engine , 0.009 secondary
    /**TODO
     * numbers for the spaceship are made up
     * add logic to turning on thrusters
     * for later uses:
     * acceleration towards the moon  =  6.67*10^-11*7.35*10^22 (G * mass of moon ) / R^2 (R = distance from center of ship to center of moon)
     *  thrusters = one main(430) and 8 sideways(25)
     *  moon from earth - 384 000 km
     *  lunar orbit = 10 000 to 290
     */
    
    spaceship(){
        this.secondary_Thrusters = new ArrayList<>();
        for( int i =0; i<8 ; i++){
            this.secondary_Thrusters.add(new secondaryThruster(25, 0.15));
        }
        this.main_Thruster = new Thrusther(430,0.009);
        this.center = new Vector(100000,30000,122004);
    }
    public double accMAX(double w){
        return acc(w, true,8);
    }
    public double acc(double w , boolean main, int secondary){
        double t = 0;
        if(main){
            t +=mainEngineForce;
        }
        t+= secondary * secondEngineForce;
        return t/wieght;
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
    public secondaryThruster getSecondaryThruster(int index) throws Exception {
        if(index <0 || index >7 ){throw new Exception("out of bounds");}
        return this.secondary_Thrusters.get(index);
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

    public Thrusther getMainThruster() {
        return main_Thruster;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public Vector getCenter() {
        return center;
    }
    public List<secondaryThruster> getSecondary_Thrusters() {
        return secondary_Thrusters;
    }
    public Thrusther getMain_Thruster() {
        return main_Thruster;
    }
    public double getFuel() {
        return fuel;
    }
    public double getVerticalSpeed() {
        return verticalSpeed;
    }
    public double getHorizontalSpeed() {
        return horizontalSpeed;
    }
    public double getDist() {
        return dist;
    }
    public double getAngelFromGround() {
        return angelFromGround;
    }
    public double getAltitude() {
        return altitude;
    }
    public double getAcceleration() {
        return acceleration;
    }
    public double getDt() {
        return dt;
    }

    public double getAll_burn() {
        return all_burn;
    }

    public double getNN() {
        return NN;
    }
    public double getWieght() {
        return wieght;
    }
    public void setWieght(double w ) {
        wieght = w;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setWieght(int wieght) {
        this.wieght = wieght;
    }
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public void setBattery(double battery) {
        this.battery = battery;
    }
    public double getBattery(){
        return this.battery;
    }
    public void setVerticalSpeed(double verticalSpeed) {
        this.verticalSpeed = verticalSpeed;
    }

    public void setHorizontalSpeed(double horizontalSpeed) {
        this.horizontalSpeed = horizontalSpeed;
    }
    public void setDist(double dist) {
        this.dist = dist;
    }
    public void setAngelFromGround(double angelFromGround) {
        this.angelFromGround = angelFromGround;
    }
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }
    public void setDt(double dt) {
        this.dt = dt;
    }
    public void setNN(double NN) {
        this.NN = NN;
    }

    public double getTime() {
        return time;
    }
    public void setTime(double t){
        this.time = t;
    }

}
