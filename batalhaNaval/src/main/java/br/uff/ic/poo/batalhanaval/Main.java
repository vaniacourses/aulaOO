/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.poo.batalhanaval;

import java.util.Scanner;

/**
 *
 * @author vania
 */
public class Main {
    
    public static void main(String[] args){
        
        BatalhaNaval bn = new BatalhaNaval();
        bn.imprimeBatalha();
        while(!bn.ehFimDoJogo()){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int palpite = teclado.nextInt();
            bn.verificaPalpite(palpite); 
            bn.imprimeBatalha();
        }
    }
    
    
}
