package Bereshit;
public class Genesis {

    public int FPS = 60;
    public static mySimulation window;

    public static void main(String[] args) {
        Genesis nisi = new Genesis();
        nisi.sayhello();
    }

    public Genesis() {
        spaceship sassy = new spaceship();
        window = new mySimulation(sassy);
        myThread cpu = new myThread("cpu", window);
        myThread gui = new myThread("gui", window);
        cpu.start();
        gui.start();
    }
    public void sayhello(){
        System.out.println("hello world");
    }
}
