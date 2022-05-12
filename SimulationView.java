package Bereshit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Graphics;
import javax.swing.*;
public class SimulationView {


    private JFrame frame;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SimulationView window = new SimulationView();
                    window.frame.setVisible(true);
                    window.frame.setResizable(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SimulationView() {
        initialize();
    }

//    public static JLabel info_label;
//    public static boolean return_home = false;
//    boolean toogleStop = true;

    private void initialize() {
        frame = new JFrame();
        frame.setSize(800,700);
        frame.setTitle("Bereshit Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLACK);
        frame.getContentPane().setLayout(null);
//        frame.setResizable(true);

        frame.setBackground(Color.BLACK);



        // field side :
        //////////////////////////////////////////////////////////////////////////
        Line = new JLabel("");
        Line.setBounds(100, 30, 100, 50);
        Line.setBackground(Color.orange);
        Line.setOpaque(true);
        Line.setText("       Fields :");
        ////////////////////////////////////////////////////////////////////
        Altitude = new JLabel("");
        Altitude.setBounds(50, 100, 250, 50);
        Altitude.setBackground(Color.green);
        Altitude.setOpaque(true);
        Altitude.setText(" Altitude (m) = ");      // the real info we will get later
        /////////////////////////////////////////////////////////////////////////////////////
        Fuel = new JLabel("");
        Fuel.setBounds(50, 170, 250, 50);
        Fuel.setBackground(Color.green);
        Fuel.setOpaque(true);
        Fuel.setText(" Fuel (kg) = ");      // the real info we will get later
        /////////////////////////////////////////////////////////////////////////////
        Battery = new JLabel("");
        Battery.setBounds(50, 240, 250, 50);
        Battery.setBackground(Color.green);
        Battery.setOpaque(true);
        Battery.setText(" Battery Charge (%) = ");      // the real info we will get later
        ///////////////////////////////////////////////////////////////////////////////
        Vertical = new JLabel("");
        Vertical.setBounds(50, 310, 250, 50);
        Vertical.setBackground(Color.green);
        Vertical.setOpaque(true);
        Vertical.setText(" Vertical (m/s) = ");      // the real info we will get later
        ///////////////////////////////////////////////////////////////////////////////
        Horizontal = new JLabel("");
        Horizontal.setBounds(50, 380, 250, 50);
        Horizontal.setBackground(Color.green);
        Horizontal.setOpaque(true);
        Horizontal.setText(" Horizontal (m/s) = ");      // the real info we will get later
        ///////////////////////////////////////////////////////////////////////////////
        Logo = new JLabel("");       // just for kidding
        Logo.setBounds(130, 500, 100, 50);
        Logo.setBackground(Color.BLUE);
        Logo.setOpaque(true);
        Logo.setText("   MGE SPACE ");      // the real info we will get later
        ///////////////////////////////////////////////////////////////////////////////


        //Engine side:       public JLabel Line2 ,MainEng,En1,En2,En3,En4,En5,En6,En7,En8;
        //////////////////////////////////////////////////////////////////////////////////////
        Line2 = new JLabel("");
        Line2.setBounds(100, 30, 100, 50);
        Line2.setBackground(Color.orange);
        Line2.setOpaque(true);
        Line2.setText("   Engines fire :");
        //////////////////////////////////////////////////////
        MainEng = new JLabel("");
        MainEng.setBounds(120, 240, 100, 100);
        MainEng.setBackground(Color.orange);
        MainEng.setOpaque(true);
        MainEng.setText("          MMT");
        /////////////////////////////////////////
        En1 = new JLabel("");
        En1.setBounds(170, 120, 50, 50);
        En1.setBackground(Color.orange);
        En1.setOpaque(true);
        En1.setText("     1");
        ////////////////////////////////////////////////////
        En2 = new JLabel("");
        En2.setBounds(240, 180, 50, 50);
        En2.setBackground(Color.orange);
        En2.setOpaque(true);
        En2.setText("      2");
        //////////////////////////////////////////////////////
        En3 = new JLabel("");
        En3.setBounds(80, 130, 50, 50);
        En3.setBackground(Color.orange);
        En3.setOpaque(true);
        En3.setText("      3");
        ///////////////////////////////////////////////////
        En4 = new JLabel("");
        En4.setBounds(30, 190, 50, 50);
        En4.setBackground(Color.orange);
        En4.setOpaque(true);
        En4.setText("      4");
        ///////////////////////////////////////////////////
        En5 = new JLabel("");
        En5.setBounds(170, 410, 50, 50);
        En5.setBackground(Color.orange);
        En5.setOpaque(true);
        En5.setText("      5");
        ///////////////////////////////////////////////
        En6 = new JLabel("");
        En6.setBounds(240, 350, 50, 50);
        En6.setBackground(Color.orange);
        En6.setOpaque(true);
        En6.setText("      6");
        ///////////////////////////////////////////////////
        En7 = new JLabel("");
        En7.setBounds(80, 400, 50, 50);
        En7.setBackground(Color.orange);
        En7.setOpaque(true);
        En7.setText("      7");
        ////////////////////////////////////////////////////
        En8 = new JLabel("");
        En8.setBounds(30, 340, 50, 50);
        En8.setBackground(Color.orange);
        En8.setOpaque(true);
        En8.setText("      8");
        ///////////////////////////////////////////////////////////////////////////

        JLabel engain_side = new JLabel("");
        engain_side.setBackground(Color.BLACK);
        engain_side.setOpaque(true);
        engain_side.setBounds(50, 50, 340, 600);
        frame.getContentPane().add(engain_side);
        JLabel fields_side = new JLabel("");
        fields_side.setBackground(Color.black);
        fields_side.setOpaque(true);
        fields_side.setBounds(400, 50, 340, 600);
//        frame.getContentPane().add(returnBtn);
        fields_side.add(Line);
        fields_side.add(Altitude);
        fields_side.add(Fuel);
        fields_side.add(Battery);
        fields_side.add(Vertical);
        fields_side.add(Horizontal);
        fields_side.add(Logo);
        frame.getContentPane().add(fields_side);
        ////////////
        engain_side.add(Line2);
        engain_side.add(MainEng);
        engain_side.add(En1);
        engain_side.add(En2);
        engain_side.add(En3);
        engain_side.add(En4);
        engain_side.add(En5);
        engain_side.add(En6);
        engain_side.add(En7);
        engain_side.add(En8);
        ////////////
        main();
    }
    // for fields side
    public JLabel Altitude , Fuel ,Battery , Vertical,Horizontal,Line,Logo;
    // for engine side
    public JLabel Line2 ,MainEng,En1,En2,En3,En4,En5,En6,En7,En8;

    public void main() {
    }



    // like this function we updating the fields
    public void updateInfo(int deltaTime) {
////        info_label.setText(algo1.drone.getInfoHTML());
//        info_label2.setText("<html>" + String.valueOf("1") + " <BR>isRisky:" + String.valueOf("2") +
//                "<BR>" + String.valueOf("4") + " <BR>is return home:" +String.valueOf(SimulationView.return_home) +"</html>");

    }

}
