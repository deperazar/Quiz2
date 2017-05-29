/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PERSONAL
 */
public class Calculator extends JFrame{
    public Calculator(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Calculator");
        
        JPanel celda0=new JPanel(new GridLayout(2,1));
        JPanel celda01= new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel celda02= new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel celda1= new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel celda11= new JPanel(new GridLayout(4,5));
        JPanel celda12= new JPanel(new GridLayout(4,1));

        
        JTextField text = new JTextField();
        text.setText("0.");
        JButton C= new JButton();
        C.setText("    C    ");
        C.setForeground(Color.red);
        
        JButton CE= new JButton();
        CE.setText("    CE   ");
        CE.setForeground(Color.red);
        
        JButton Backspace= new JButton();
        Backspace.setText("Backspace");
        Backspace.setForeground(Color.red);
        
        celda01.add(Backspace);
        celda01.add(CE);
        celda01.add(C);
        celda02.add(text);
        celda0.add(text);
        celda0.add(celda01);
        add(celda0, BorderLayout.NORTH);
        /////////////////////////////////
        JButton MC= new JButton();
        MC.setText("MC");
        MC.setForeground(Color.red);
        
        JButton MR= new JButton();
        MR.setText("MR");
        MR.setForeground(Color.red);
        
        JButton MS= new JButton();
        MS.setText("MS");
        MS.setForeground(Color.red);
        
        JButton Mplus= new JButton();
        Mplus.setText("M+");
        Mplus.setForeground(Color.red);
        
        celda12.add(MC);
        celda12.add(MR);
        celda12.add(MS);
        celda12.add(Mplus);
        //------------------------------
        
        JButton[] b=new JButton[20];
        for (int i = 0; i < 20; i++) {
            b[i]=new JButton();
            b[i].setForeground(Color.blue);
        }
        b[0].setText("7");
        b[1].setText("8");
        b[2].setText("9");
        b[3].setText("/");
        b[3].setForeground(Color.red);
        b[4].setText("sqrt");
        b[5].setText("4");
        b[6].setText("5");
        b[7].setText("6");
        b[8].setText("*");
        b[8].setForeground(Color.red);
        b[9].setText("%");
        b[10].setText("1");
        b[11].setText("2");
        b[12].setText("3");
        b[13].setText("-");
        b[13].setForeground(Color.red);
        b[14].setText("1/x");
        b[15].setText("0");
        b[16].setText("+/-");
        b[17].setText(".");
        b[18].setText("+");
        b[18].setForeground(Color.red);
        b[19].setText("-");
        b[19].setForeground(Color.red);
        
        for (int i = 0; i < 20; i++) {
            celda11.add(b[i]);
        }
        
        celda1.add(celda12);
        celda1.add(celda11);
        
        add(celda1,BorderLayout.CENTER);
        
    }
    
    public static void main(String [] args){
        Calculator frame=new Calculator();
        frame.setBounds(900, 500, 360, 220);
        frame.setResizable(false);
        
        frame.setVisible(true);
    }
}
