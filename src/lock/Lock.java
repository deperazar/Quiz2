/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lock;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author PERSONAL
 */
public class Lock extends JFrame implements ActionListener{
    private String password="1234";
    private JButton openclose, changec;
    private JTextField combination;
    
    public Lock(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        setSize(new Dimension(200, 200));
        setTitle("Test Componentes");
        setLayout(new GridLayout(3,1));
        openclose= new JButton();
        openclose.setText("TO OPEN");
        openclose.setBackground(Color.red);
        openclose.setOpaque(true);
        add(openclose);
        
        combination=new JTextField();
        add(combination);
        
        changec= new JButton();
        changec.setText("CHANGE COMBINATION");
        add(changec);
        
        openclose.addActionListener(this);
        combination.addActionListener(this);
        changec.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==openclose){
            if(openclose.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]")&&combination.getText().equals(this.password)){
            openclose.setText("TO CLOSE");
            openclose.setBackground(Color.green);
            }else{
                if(!combination.getText().equals(this.password)){
                    if(openclose.getBackground().toString().equals("java.awt.Color[r=0,g=255,b=0]")){
                        openclose.setBackground(Color.red);
                        openclose.setText("TO OPEN");
                    }else{
                        JOptionPane.showMessageDialog(null, "WRONG COMBINATION"); 
                    }  
                }
                else{
                        openclose.setBackground(Color.red);
                        openclose.setText("TO OPEN");
                }
            }
        }else if(e.getSource()==changec){
            if(openclose.getBackground().toString().equals("java.awt.Color[r=0,g=255,b=0]")){
                if(this.password.equals(combination.getText())){
                    JOptionPane.showMessageDialog(null, "YOU MUST TYPE A NEW COMBINATION"); 
                }else
                {
                    this.password=combination.getText();
                    JOptionPane.showMessageDialog(null, "THE COMBINATION HAS SUCCESFULLY BEEN CHANGED"); 
                }
            }else{
                 JOptionPane.showMessageDialog(null, "YOU HAVE TO OPEN IT FIRST"); 
            }
        }
    }
    
    public static void main(String[] args){
        Lock calc= new Lock();
        calc.setBounds(900, 500, 200, 200);
        calc.setResizable(false);
        calc.setVisible(true);
    }
    
}
