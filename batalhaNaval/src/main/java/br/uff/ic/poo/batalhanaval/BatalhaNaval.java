/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.poo.batalhanaval;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vania
 */
public class BatalhaNaval {
    
    private char[] batalha = new char[10];
    private ArrayList<Integer> localizacao = new ArrayList<Integer>();
    private int numAcertos = 0;
    
    public BatalhaNaval(){
        Random r = new Random();
        int posInicial = r.nextInt(8);
        localizacao.add(posInicial);
        localizacao.add(posInicial+1);
        localizacao.add(posInicial+2);

        System.out.println(posInicial);
        this.inicializaBatalha();
    }
    
    private void inicializaBatalha(){
        for (int i =0; i<this.batalha.length; i++){
            this.batalha[i] = 'O';
        }
    }
    
    public void verificaPalpite(Integer palpite){
        if (localizacao.contains(palpite)) {
            this.batalha[palpite] = 'X';
            numAcertos++; 
            localizacao.remove(palpite);
        }
        else{
          this.batalha[palpite] = '~';  
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
