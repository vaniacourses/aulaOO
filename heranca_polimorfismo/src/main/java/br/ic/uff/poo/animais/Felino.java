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
public abstract class Felino extends Animal{
    
    public Felino(){
        super();
    }    
    
    public Felino(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY){
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY);
    }    
    
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
