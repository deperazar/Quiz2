/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PERSONAL
 */
public class Controller implements ActionListener{
    private View view;
    private Model model;
    
    
    public Controller(){
        this.model = new Model();
    }
    public void setview(View view){
        this.view= view;
    }
    public Model getmodel(){
        return this.model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("DONE")){
            model.setname(this.view.getname().getText());
            model.setlastname(this.view.getlastname().getText());
            model.setsentence("Hello, "+model.getname()+" "+model.getlastname());
            this.view.getsentence().setText(model.getsentence());
        }      
    }
    
}
