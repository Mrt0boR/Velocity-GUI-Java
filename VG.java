import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class VG {
    public static void main(String[] args){
        JFrame frame = new JFrame("Velocity");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridBagLayout());

        //Jcomponents (incl gridbagcontraints)
         GridBagConstraints dgbc = new GridBagConstraints();
        
         JTextField distance = new JTextField(10);
        dgbc.gridx = 1;
        dgbc.gridy = 0;
        panel.add(distance, dgbc);
        JLabel distancelabel = new JLabel("Distance: ");
        dgbc.gridx = 0;
        dgbc.gridy = 0;
    
        panel.add(distancelabel, dgbc);

       //align the label to the right place
       GridBagConstraints tgbc1 = new GridBagConstraints();
        JLabel timelabel = new JLabel("Time: ");
        tgbc1.gridx = 0; //0
        tgbc1.gridy = -1; //0 
       
       GridBagConstraints tgbc2 = new GridBagConstraints();
       
        JTextField timeinput = new JTextField(10);

        tgbc2.gridx = 1;  //d 1
        tgbc2.gridy = -1; //0
        
        panel.add(timelabel, tgbc1);
        panel.add(timeinput, tgbc2);
            //Summing up
        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}

//add mathematical functionality and display options at the bottom of the GUI
//maybe serparate into public and private?