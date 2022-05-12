package Bereshit;

public class mySimulation {
    public static void main(String[] args) {
        spaceship spacechip = new spaceship();
        System.out.println(spacechip.getSecondaryThrustersStatus());
        spacechip.turnSecondaryThruster(2,true);
        spacechip.turnSecondaryThruster(0,true);
        System.out.println(spacechip.getSecondaryThrustersStatus());
    }
    public class course{
        // this is an elipsode!
        private int semiMajor = 0;
        private int semiMinor = 0;
        private Point l;
        double angel;
        private Point center;
        // by formula
        private double constantH = (Math.pow(semiMajor-semiMinor,2)/Math.pow(semiMajor+semiMinor,2));

        public double getCircumference(){
            // by formula
            return ((Math.PI*(this.semiMajor+this.semiMinor)*(1+ ((3*constantH)/10 + Math.sqrt(4-3*constantH)))));
        }
        public double calculateDistanceCircel2d(Point A, Point B){
            return Math.sqrt(Math.pow(A.getX() - B.getX(),2) +Math.pow(A.getX() - B.getX(),2));
        }

    }
}
