package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    HotelManagementSystem(){
        setBounds(300,200,1200,675);
        //setSize(400,400);
        //setLocation(300,300);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1200,675);
        add(l1);
        setLayout(null);
        setVisible(true);
        
        JButton b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(960,550,150,50);
        b1.addActionListener(this);
        l1.add(b1);
    }
    
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        // this will be current class object
        this.setVisible(false);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new HotelManagementSystem();
    }
    
}
