/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vania
 */
public class BoloRetangular {
    
    float peso;
    String sabor;
    String cobertura;
  
 
    void decorar(){
        System.out.println("Bolo decorado");        
    }
    
    void comer(float pesoComido){
        peso = peso - pesoComido;
    }
    
}
