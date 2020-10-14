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
public class Ave extends Animal{
    
    
    @Override
    public void circular(){
        System.out.println("Estou voando ");   
    }
    
    @Override
    public void comer(String comida){
        if (comida.equals("carne")){
            System.out.println("Não quero comer");  
        }
        else {
            super.comer(comida);
        }  
    }
    
}
