package librarymanagementsystem;
import java.sql.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginPage 
{
    public static void main(String args[])
    {
        LoginUser object=new LoginUser();
    }
    
}

class LoginUser extends JFrame implements ActionListener
{
    private JTextField t1;
    private JLabel l1, l2;
    private JPasswordField p1;
    private JButton b1, b2;
    LoginUser()
    {
        JLabel label=new JLabel("Login Menu");
        setBackground(Color.white);
        setBounds(350, 150, 500, 350);
        
        setLayout(null);
        
        /*Username Label*/
        l1=new JLabel("Username: ");
        l1.setBounds(100, 80, 100, 25);
        add(l1);
        
        /*Password Label*/
        l2=new JLabel("Password: ");
        l2.setBounds(100, 130, 100, 25);
        add(l2);
        
        /*Username TextField*/
        t1=new JTextField();
        t1.setBounds(210, 80, 157, 25);
        add(t1);
        
        /*Password Field*/
        p1= new JPasswordField();
        p1.setBounds(210, 130, 157, 25);
        add(p1);
        
        /*Login Button*/
        b1= new JButton("Login");
        b1.setBounds(100, 200, 100, 40);
        b1.addActionListener(this);
        add(b1);
        
        /*Sign Up Button*/
        b2= new JButton("Sign up");
        b2.setBounds(265, 200, 100, 40);
        b2.addActionListener(this);
        add(b2);
        
        
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
           try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/s22_90 ","root","12345678");
                Statement stmt=con.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from login");
                
                String user = t1.getText();
                String pwd=  new String (p1.getPassword());
                
                while(rs.next()) 
                {
                    String uname=rs.getString("username");
                    //Username is the coloumn nam"Usernamee in the database table
                    String password=rs.getString("password");
                    if ((user.equals(uname)) && (pwd.equals(password)))
                     new Menu().setVisible(true);
                }
                con.close();
            }
        catch (Exception ee)
        {
        JOptionPane.showMessageDialog(this, ee.getMessage());
        }
        }

        else if(e.getSource()==b2)
        {
            if(e.getSource()==b2)
            {
                this.setVisible(false);
                new Signup().setVisible(true);
            }
        }
    }
}

