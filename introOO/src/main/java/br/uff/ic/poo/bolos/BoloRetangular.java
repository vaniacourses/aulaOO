package br.uff.ic.poo.bolos;

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
    
    private float peso;
    private String sabor;
    private String cobertura;
    
    public BoloRetangular(float peso, String sabor, String cobertura){
        this.peso = peso;
        this.sabor = sabor;
        this.cobertura = cobertura;
    }
    
    public BoloRetangular(String sabor, String cobertura){
        this.sabor = sabor;
        this.cobertura = cobertura;
        this.peso = 0;
    }
    
    public BoloRetangular(){
        
    }
  
 
    void decorar(){
        System.out.println("Bolo decorado");        
    }
    
    void comer(float pesoComido){
        peso = peso - pesoComido;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public String getSabor(){
        return this.sabor;
    }
    
    public String getCobertura(){
        return this.cobertura;
    }
    
    public void setPeso(float peso){
        if (peso >= 0 ){
           this.peso = peso; 
        }        
    }
    
    
}
