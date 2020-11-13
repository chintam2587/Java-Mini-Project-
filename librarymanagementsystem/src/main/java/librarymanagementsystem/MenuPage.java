package librarymanagementsystem;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.swing.JTextField;
import javax.swing.JButton;
import  javax.swing.JFrame ;
import javax.swing.JLabel;


public class MenuPage
{
    public static void main(String args[])
    {
        Menu obj =new Menu() ;
    }

   
    }

    class Menu extends JFrame implements ActionListener
   {
        JButton b1,b2,b3,b4,b5, b6 ;
        Menu()
        {
            super("Menu Page") ;
        setLayout(null) ;
      b1 = new JButton("Add Student ");
        add(b1) ;
        b1.setBounds(100, 100, 120, 90);
         b2= new JButton("Add book") ;
         add(b2) ;
        b2.setBounds(300, 100, 120, 90);
        
         b3 = new JButton("Issue a book") ;
        add(b3) ;
        
         b3.setBounds(500, 100, 120, 90);
        
         b4 = new JButton("Return a book") ;
        add(b4) ;
        
         b4.setBounds(100, 200, 120, 90);
        
         b5 = new JButton("Delete a book") ;
        add(b5) ;
        
         b5.setBounds(300, 200, 120, 90);
        
         b6= new JButton("Delete Student Record") ;
        add(b6) ;
      
         b6.setBounds(500, 200,120, 90);
        
        setVisible(true) ;
        setSize(400,400) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      /*   b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
        b3.addActionListener((ActionListener) this);
        b4.addActionListener((ActionListener) this);
        b5.addActionListener((ActionListener) this);
        b6.addActionListener((ActionListener) this);
      */
        
        
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    }
/*
 public void actionPerformed(ActionEvent e)
    {
    }*/