/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ic.uff.poo.animais;

/**
 *
 * @author vania
 */
public class Felino extends Animal{
    
  
    @Override
    public void comer(String comida){
        if (comida.equals("carne")){
            System.out.println("Adoro carne!");  
        }
        else {
            System.out.println("Não quero comer");
        }  
    }    
    
}
