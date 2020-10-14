/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.poo.batalhanaval;

import java.util.Random;

/**
 *
 * @author vania
 */
public class BatalhaNaval {
    
    private char[] batalha = new char[10];
    private int[] localizacao = new int[3];
    private int numAcertos = 0;
    
    public BatalhaNaval(){
        Random r = new Random();
        int posInicial = r.nextInt(8);
        localizacao[0] = posInicial;
        localizacao[0] = posInicial + 1;
        localizacao[0] = posInicial + 2;

        System.out.println(posInicial);
        this.inicializaBatalha();
    }
    
    private void inicializaBatalha(){
        for (int i =0; i<this.batalha.length; i++){
            this.batalha[i] = 'O';
        }
    }
    
    public void verificaPalpite(int palpite){
        for (int local: this.localizacao){
            if (palpite == local){
                this.batalha[palpite] = 'X';
                numAcertos++;    
                break;
            }
           else{
              this.batalha[palpite] = '~';  
            }            
        }
    }
          
    public void imprimeBatalha(){
        for (char celula: this.batalha){
            System.out.print(" | "+celula);
        }
        System.out.println(" |");
    }
    
    public boolean ehFimDoJogo(){
        return numAcertos == 3;
    }
    
}
