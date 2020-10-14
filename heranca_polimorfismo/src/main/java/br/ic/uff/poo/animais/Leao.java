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
public class Leao extends Felino{
    
    
    public Leao(){
        super();
    }        
    public Leao(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY){
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY);
    }        
    @Override
    public void fazerRuido(){
        System.out.println("roar");
    }        
    
}
