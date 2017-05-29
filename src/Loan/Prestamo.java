/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PERSONAL
 */
public class Prestamo extends JFrame implements ActionListener{
    private String interestloan;
    private String nyears;
    private String amountloan;
    
    private JTextField interest;
    private JTextField years;
    private JTextField loanam;
    private JTextField monthp;
    private JTextField tpayment;

    private JButton compayment;
    

    public Prestamo(){
        
        this.interestloan="";
        this.nyears="";
        this.amountloan="";
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        setSize(new Dimension(200, 200));
        setTitle("Loan Calculator");
        
        JLabel l1= new JLabel("Enter loan amount, interest rate, and years");
        JLabel l2= new JLabel("Annual Interest Rate");
        JLabel l3= new JLabel("Number of Years");
        JLabel l4= new JLabel("Loan Amount");
        JLabel l5= new JLabel("Monthly Payment");
        JLabel l6= new JLabel("Total Payment");
        
        setLayout(new BorderLayout());
        
        interest= new JTextField();
        years= new JTextField();
        loanam= new JTextField();
        monthp= new JTextField();
        tpayment= new JTextField();
        
        compayment= new JButton();
        compayment.setText("Compute Payment");
                
        add(l1,BorderLayout.NORTH);
        JPanel celda=new JPanel(new GridLayout(5,2));
    
        celda.add(l2);
        celda.add(interest);
        celda.add(l3);
        celda.add(years);
        celda.add(l4);
        celda.add(loanam);
        celda.add(l5);
        celda.add(monthp);
        celda.add(l6);
        celda.add(tpayment);
        add(celda,BorderLayout.CENTER);

        JPanel celda2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        celda2.add(compayment);
        add(celda2,BorderLayout.SOUTH);
        
        interest.addActionListener(this);
        years.addActionListener(this);
        loanam.addActionListener(this);
        compayment.addActionListener(this);
    }
            
            
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==interest){
            this.interestloan=interest.getText();
        }
        else if(e.getSource()==years){
            this.nyears=years.getText();
        }
        else if(e.getSource()==loanam){
            this.amountloan=loanam.getText();   
        }
        else if(e.getSource()==compayment){
            
            //JOptionPane.showMessageDialog(null,String.valueOf(computempay()));
            monthp.setText(String.valueOf(computempay()));
            tpayment.setText(String.valueOf(computetpay()));
            
        }
        
    }
    public double computempay(){
        
        double interestl = Double.parseDouble(this.interestloan);
        int nyear = Integer.parseInt(this.nyears);
        double aml = Double.parseDouble(this.amountloan);
        double mpay=(aml*interestl/1200)/(1-Math.pow(1+(interestl/1200), -12*nyear));
         
        return Math.rint(mpay*1000)/1000;
    }
    
    public double computetpay(){    
       computempay();
       int nyear = Integer.parseInt(this.nyears);
       double tpay=12*nyear*computempay();
       
       return Math.rint(tpay*10000)/10000;
    }
    
    public static void main( String [] args){
        JOptionPane.showMessageDialog(null,"PRESS ENTER AFTER TYPING ANY VALUE");
        Prestamo loanpr= new Prestamo();
        loanpr.setBounds(900, 500, 300, 200);
        loanpr.setResizable(false);
        
        loanpr.setVisible(true);
    }
    
}
