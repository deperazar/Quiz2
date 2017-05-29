/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author PERSONAL
 */
public class Model {
    private String name;
    private String lastname;
    private String sentence;
    
    
    public void setname(String name){
        this.name=name;
    }
    public void setlastname(String lastname){
        this.lastname=lastname;
    }
    public String getname(){
        return this.name;
    }
    public String getlastname(){
        return this.lastname;
    }
    public void setsentence(String sentence){
        this.sentence=sentence;
    }
    public String getsentence(){
        return this.sentence;
    }
    
    
    
}
