/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author surbh
 */
public class AddDriver extends JFrame{
    
    JTextField t1,t2,t3,t4,t5;
    JComboBox c1,c2;
    AddDriver(){
        
        JLabel title = new JLabel("Add Drivers");
        title.setBounds(150,10,150,30);
        title.setFont(new Font("Tahoma",Font.BOLD,18));
        add(title);
        
        JLabel name = new JLabel("Name");
        name.setBounds(60,70,100,30);
        name.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(name);
        
        t1 = new JTextField();
        t1.setBounds(200,70,150,30);
        add(t1);
        
        JLabel age = new JLabel("Age");
        age.setBounds(60,110,100,30);
        age.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(age);
        
        t2 = new JTextField();
        t2.setBounds(200,110,150,30);
        add(t2);
        
        JLabel gender = new JLabel("Gender");
        gender.setBounds(60,150,100,30);
        gender.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(gender);
        
        c1 = new JComboBox(new String[]{"Male","Female"});
        c1.setBounds(200,150,150,30);
        add(c1);
        
        JLabel car = new JLabel("Car Company");
        car.setBounds(60,190,100,30);
        car.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(car);
        
        t3 = new JTextField();
        t3.setBounds(200,190,150,30);
        add(t3);
        
        JLabel model = new JLabel("Car Model");
        model.setBounds(60,230,100,30);
        model.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(model);
        
        t4 = new JTextField();
        t4.setBounds(200,230,150,30);
        add(t4);
        
        JLabel available = new JLabel("Available");
        available.setBounds(60,270,100,30);
        available.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(available);
        
        c2 = new JComboBox(new String[]{"Available","Busy"});
        c2.setBounds(200,270,150,30);
        add(c2);
        
        JLabel location = new JLabel("Location");
        location.setBounds(60,310,100,30);
        location.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(location);
        
        t5 = new JTextField();
        t5.setBounds(200,310,150,30);
        add(t5);
        
        setLayout(null);
        setBounds(400,200,800,400);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new AddDriver().setVisible(true);
    }
}
