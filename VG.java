import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VG implements ActionListener {
    
    JTextField distanceField = new JTextField(10);
    JTextField timeField = new JTextField(10);
    JTextField resultField = new JTextField(5);

    // constructor
    public VG() {
        GUISetup();
    }

    public String calculate(String distanceString, String timeString) {
        double distance = Double.parseDouble(distanceString);
        double time = Double.parseDouble(timeString);
        double speed = distance/time;
        return Double.toString(speed);
    }

    public void GUISetup() {
        JFrame frame = new JFrame("Velocity");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridBagLayout());

        //Jcomponents (incl gridbagcontraints)
        GridBagConstraints dgbc = new GridBagConstraints();
        
        dgbc.gridx = 1;
        dgbc.gridy = 0;
        panel.add(distanceField, dgbc);

        JLabel distanceLabel = new JLabel("Distance: ");
        dgbc.gridx = 0;
        dgbc.gridy = 0;
        panel.add(distanceLabel, dgbc);

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
        calculateButton.addActionListener(this);

        //add output field
        dgbc.gridx = 1;
        dgbc.gridy = 3;
        panel.add(resultField, dgbc);

        JLabel resultLabel = new JLabel("Result: ");
        dgbc.gridx = 0;
        dgbc.gridy = 3;
        panel.add(resultLabel, dgbc);

        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
       String distanceString = distanceField.getText();
       String timeString = timeField.getText();
       try{
        String resultString = calculate(distanceString, timeString);
        resultField.setText(resultString);
       } catch (NumberFormatException exeception) {
        resultField.setText("Invalid Input");
       }
   }

    public static void main(String[] args){
        new VG();
    }
}










//add mathematical functionality and display options at the bottom of the GUI
//maybe serparate into public and private?