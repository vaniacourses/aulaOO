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
public class Gato extends Felino implements Domesticavel {
    
    
    public Gato(){
        super();
    }        
    public Gato(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY){
        super(imagem, comida, nivelFome, localizacaoX, localizacaoY);
    }    

    @Override
    public void fazerRuido(){
        System.out.println("Miau");
    }        

    @Override
    public void brincar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void serAmigavel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
