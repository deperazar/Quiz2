/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PERSONAL
 */
public class View extends JFrame {
    
    private Controller controller;
    
    private JLabel hello;
    private JTextField namefield;
    private JTextField lastnamefield;
    private JButton done;
    public View(Controller controller){
        this.controller=controller;
        this.controller.setview(this);
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(new Dimension(300, 300));
       setTitle("LogIn");
       setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
       
       JLabel namelabel=new JLabel("Enter your first name");
       JLabel lastnamelabel=new JLabel("Enter your last name");
       
       
       JPanel p1=new JPanel(new BorderLayout());
       JPanel p2=new JPanel(new BorderLayout());
       JPanel p3=new JPanel(new BorderLayout());
       
       hello=new JLabel();
       namefield=new JTextField();
       lastnamefield=new JTextField();
       done=new JButton();
       done.setText("DONE");
       hello.setText(this.controller.getmodel().getsentence());
       
       
       add(namelabel);
       add(namefield);
       add(lastnamelabel);
       add(lastnamefield);
       p1.add(done,BorderLayout.NORTH);
       p1.add(hello,BorderLayout.CENTER);
       add(p1);
       
       done.addActionListener(controller);
       
       
       setVisible(true);
    }
    
    public JTextField getname(){
        return this.namefield;
    }
    public JTextField getlastname(){
        return this.lastnamefield;
    }
    public JLabel getsentence(){
        return this.hello;
    }
    
   
    
}
