
// Level 3 - Task 2 Build a Desktop Application

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeskApp extends JFrame implements ActionListener{

    JTextField t1, t2, t3;
    JPasswordField p1;
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1, l2, l3, l4, l5;
    
    public void login_page() {
        JFrame jf = new JFrame("Login Page");
        t1 = new JTextField(20);
        p1 = new JPasswordField(20);
        b1 = new JButton("Login");
        l1 = new JLabel("Enter Username::");
        l2 = new JLabel("Enter Password::");
        p1.setEchoChar('*');

        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(p1);
        jf.add(b1);
        

        b1.addActionListener(this);
        jf.setVisible(true);
        jf.setSize(400, 400);
        jf.setLayout(new FlowLayout());

    }

    
    public void main_page() {
        JFrame jf1 = new JFrame("Calculator");
        t2 = new JTextField(20);
        t3 = new JTextField(20);

        l3 = new JLabel("Enter First Number::");
        l4 = new JLabel("Enter Second Number::");
        l5 = new JLabel("Answer");

        b2 = new JButton("Addition");
        b3 = new JButton("Subtraction");
        b4 = new JButton("Multiplication");
        b5 = new JButton("Division");
        b6 = new JButton("Modulo");
        

        jf1.add(l3);
        jf1.add(t2);
        jf1.add(l4);
        jf1.add(t3);
        jf1.add(b2);
        jf1.add(b3);
        jf1.add(b4);
        jf1.add(b5);
        jf1.add(b6);
        jf1.add(l5);

        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
     
        jf1.setVisible(true);
        jf1.setSize(400,400);
        jf1.setLayout(new FlowLayout());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == b1) {
            String s1 = t1.getText();
            String s2 = p1.getText();

            if (s1.equals("Prathamesh") && s2.equals("Prs123")) {
                t1.setText("");
                p1.setText("");
                main_page();
            }
            else if ( s1.equals("") && s2.equals("")) {
                JOptionPane.showMessageDialog(this, "Enter your Credentials.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Invalid User!!");
                t1.setText("");
                p1.setText("");
            }
        }
        

        if (e.getSource() == b2) {
            String s1 = t2.getText();
            String s2 = t3.getText();

            if ( s1.equals("") && s2.equals("")) {
                JOptionPane.showMessageDialog(this, "Enter your Values.");
            }
            
            double fn = Double.parseDouble(s1);
            double sc = Double.parseDouble(s2);

            l5.setText("Addition is = "+(fn+sc));

            t2.setText("");
            t3.setText("");
        }

        if (e.getSource() == b3) {
            String s1 = t2.getText();
            String s2 = t3.getText();

            if ( s1.equals("") && s2.equals("")) {
                JOptionPane.showMessageDialog(this, "Enter your Values.");
            }
            
            double fn = Double.parseDouble(s1);
            double sc = Double.parseDouble(s2);

            l5.setText("Subtraction is = "+(fn-sc));

            t2.setText("");
            t3.setText("");
        }

        if (e.getSource() == b4) {
            String s1 = t2.getText();
            String s2 = t3.getText();

            if ( s1.equals("") && s2.equals("")) {
                JOptionPane.showMessageDialog(this, "Enter your Values.");
            }
            
            double fn = Double.parseDouble(s1);
            double sc = Double.parseDouble(s2);

            l5.setText("Multiplication is = "+(fn*sc));

            t2.setText("");
            t3.setText("");
        }

        if (e.getSource() == b5) {
            String s1 = t2.getText();
            String s2 = t3.getText();

            if ( s1.equals("") && s2.equals("")) {
                JOptionPane.showMessageDialog(this, "Enter your Values.");
            }
            
            double fn = Double.parseDouble(s1);
            double sc = Double.parseDouble(s2);

            l5.setText("Division is = "+(fn/sc));

            t2.setText("");
            t3.setText("");
        }

        if (e.getSource() == b6) {
            String s1 = t2.getText();
            String s2 = t3.getText();

            if ( s1.equals("") && s2.equals("")) {
                JOptionPane.showMessageDialog(this, "Enter your Values.");
            }
            
            double fn = Double.parseDouble(s1);
            double sc = Double.parseDouble(s2);

            l5.setText("Modulo is = "+(fn%sc));

            t2.setText("");
            t3.setText("");
        }
        
        }

    public static void main(String[] args) {
        DeskApp object = new DeskApp();
        object.login_page();
    }
}