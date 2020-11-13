/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * 
 */
public class SignupPage 
{
    public static void main(String args[])
    {
        Signup object3=new Signup();
    }
}
class Signup extends JFrame implements ActionListener
{
    private JButton b1, b2;
    private JLabel l1, l2, l3;
    private JTextField t1, t2;
    private JPasswordField p1;
    
    Signup()
    {
        setBackground(Color.white);
        setBounds(350, 150, 500, 350);
        setLayout(null);
        
        /*Username Label*/
        l1=new JLabel("Username: ");
        l1.setBounds(100, 50, 100, 25);
        add(l1);
        
        /*Full Name*/
        l2=new JLabel("Full Name: ");
        l2.setBounds(100, 100, 100, 25);
        add(l2);
        
        /*Password Label*/
        l3=new JLabel("Password: ");
        l3.setBounds(100, 150, 100, 25);
        add(l3);
        
        /*Username TextField*/
        t1=new JTextField();
        t1.setBounds(210, 50, 157, 25);
        add(t1);
        
        /*Full name TextField*/
        t2=new JTextField();
        t2.setBounds(210, 100, 157, 25);
        add(t2);
        
        /*Password Field*/
        p1= new JPasswordField();
        p1.setBounds(210, 150, 157, 25);
        add(p1);
        
        /*Create Button*/
        b1= new JButton("Create");
        b1.setBounds(100, 220, 100, 40);
        b1.addActionListener(this);
        add(b1);
        
        /*Back Button*/
        b2= new JButton("Back");
        b2.setBounds(265, 220, 100, 40);
        b2.addActionListener(this);
        add(b2);
        
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
            
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2)
        {
            this.setVisible(false);
            new LoginUser().setVisible(true);
        }
    }
}
