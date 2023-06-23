import javax.swing.*;
import java.awt.*;

public class VG {
    //mathematical operation method
    double distance;
    double time;
    
    static double calculate(double distance, double time) {
        return distance/time;
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Velocity");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridBagLayout());

        //Jcomponents (incl gridbagcontraints)
        GridBagConstraints dgbc = new GridBagConstraints();
        
        JTextField distanceField = new JTextField(10);
        dgbc.gridx = 1;
        dgbc.gridy = 0;
        panel.add(distanceField, dgbc);

        JLabel distanceLabel = new JLabel("Distance: ");
        dgbc.gridx = 0;
        dgbc.gridy = 0;
        panel.add(distanceLabel, dgbc);

        JTextField timeField = new JTextField(10);
        dgbc.gridx = 1;  //d 1
        dgbc.gridy = 1; //0
        panel.add(timeField, dgbc);

        JLabel timeLabel = new JLabel("Time: ");
        dgbc.gridx = 0; //0
        dgbc.gridy = 1; //0 
        panel.add(timeLabel, dgbc);

        //add button to perform calculation
        JButton calculateButton = new JButton("Calculate");
        dgbc.gridx = 1;
        dgbc.gridy = 2;
        panel.add(calculateButton, dgbc);

        //add output field
        JTextField resultField = new JTextField(5);
        dgbc.gridx = 1;
        dgbc.gridy = 3;
        panel.add(resultField, dgbc);

        JLabel resultLabel = new JLabel("Result: ");
        dgbc.gridx = 0;
        dgbc.gridy = 3;
        panel.add(resultLabel, dgbc);

        //Summing up
        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

//add mathematical functionality and display options at the bottom of the GUI
//maybe serparate into public and private?