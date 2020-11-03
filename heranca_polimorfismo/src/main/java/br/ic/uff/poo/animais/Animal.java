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
public abstract class Animal {
    
    protected String imagem;
    protected String comida;
    protected int nivelFome;
    protected int localizacaoX;
    protected int localizacaoY;
    
    
    public Animal(){
        this("", "", 0, 0, 0);
    }    
    
    public Animal(String imagem, String comida, int nivelFome, int localizacaoX, int localizacaoY){
        this.imagem = imagem;
        this.comida = comida;
        this.nivelFome = nivelFome;
        this.localizacaoX = localizacaoX;
        this.localizacaoY = localizacaoY;
    }    
    
    
    public abstract void fazerRuido();

    public void comer(){
        System.out.println("Estou comendo ");
    }
        
    
    public void comer(String comida){
        System.out.println("Estou comendo "+comida);
    }
    
    public void comer(String comida, int qtde){
        System.out.println("Estou comendo "+qtde+ " de " +comida);
    }
    
    public void dormir(){
        System.out.println("zzZZzzZZzzz");
    }
    
     public void circular(){
        System.out.println("Estou circulando ");
    }  
    
}
