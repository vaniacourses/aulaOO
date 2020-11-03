/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ic.uff.poo.tiposclasses;

import java.util.ArrayList;

/**
 *
 * @author vania
 */
public class Genericos {
    
    public static void main (String[] args){
        
        Integer arrayI[] = {-3, -2, 1, 0, 2, 4, 3, 0};
        Double arrayD[] = {0.0, 0.5, 1.0, 2.0, 1.5, -0.5};
        System.out.println("Maior inteiro " + maior(arrayI));
        System.out.println("Maior double " + maior(arrayD));
       
    }
    
    public static <T extends Comparable> T maior(T array[]){
        T maior = array[0];
        for (T elemento: array){
            if (maior.compareTo(elemento)<0){
                maior = elemento;
            }
        }
        return maior;        
    }
  
    
}
