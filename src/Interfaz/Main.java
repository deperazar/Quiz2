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
public class Main {
   public static void main(String[] args) {
       Controller controlador = new Controller();
       View vista = new View(controlador);
   }
}
