package br.uff.ic.poo.main;


import br.uff.ic.poo.bolos.BoloRetangular;
import br.uff.ic.poo.bolos.BoloRetangular;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vania
 */
public class Main {
    
    public static void main (String[] args){
        
        BoloRetangular boloChocolate = new BoloRetangular(3, "Chocolate", "Morango"); 
        imprimir(boloChocolate);
        System.out.println("--------------");
        
        BoloRetangular boloMorango = new BoloRetangular("Morango", "Brigadeiro");
        imprimir(boloMorango);
        
        System.out.println("--------------");
        BoloRetangular boloBanana = new BoloRetangular();
        imprimir(boloBanana);
        
        boloChocolate.setPeso(-1);        
        imprimir(boloChocolate);
        
       
  /*      boloChocolate.comer(1); 

       
        boloChocolate.decorar();
        
        BoloRetangular boloMorango = new BoloRetangular();
        
        boloMorango.peso = 4;
        boloMorango.sabor = "Morango";
        boloMorango.cobertura = "Brigadeiro";
        

        boloChocolate.comer(1);
        
        System.out.println("Antes...");
        System.out.println("Morango...");
        imprimir(boloMorango);
        System.out.println("Chocolate...");
        imprimir(boloChocolate);  
        
        boloMorango = boloChocolate;
        
      
        boloMorango.comer(1);
        
        System.out.println("Depois...");
        System.out.println("Morango...");
        imprimir(boloMorango);
        System.out.println("Chocolate...");
        imprimir(boloChocolate);     */   
        
    }
    
    static void imprimir(BoloRetangular bolo){
        System.out.println("Peso: "+ bolo.getPeso());
        System.out.println("Sabor: " + bolo.getSabor());
        System.out.println("Cobertura: " + bolo.getCobertura());          
    }
    
    
    
}
