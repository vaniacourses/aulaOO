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
public class Animal {
    
    protected String imagem;
    protected String comida;
    protected int nivelFome;
    protected int localizacaoX;
    protected int localizacaoY;
    
    public void fazerRuido(){
        System.out.println("Ruído de um animal genérico");
    }
  
    
    public void comer(String comida){
        System.out.println("Estou comendo "+comida);
    }
    
   
    public void dormir(){
        System.out.println("zzZZzzZZzzz");
    }
    
     public void circular(){
        System.out.println("Estou circulando ");
    }  
    
}
