package Drone;

public class Thrusther {

    private boolean working;
    private double thrust;

    public boolean isWorking() {
        return working;
    }
    public void turnOffOn(boolean flag) {
        this.working = flag;
    }


    Thrusther(double thrust){
        this.thrust = thrust;
    }

}
