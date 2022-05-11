package Drone;

public class mySimulation {
    public class course{
        // this is an elipsode!
        private int semiMajor = 0;
        private int semiMinor = 0;
        private Point center;
        // by formula
        private double constantH = (Math.pow(semiMajor-semiMinor,2)/Math.pow(semiMajor+semiMinor,2));

        public double getCircumference(){
            // by formula
            return ((Math.PI*(this.semiMajor+this.semiMinor)*(1+ ((3*constantH)/10 + Math.sqrt(4-3*constantH)))));
        }

    }
}
