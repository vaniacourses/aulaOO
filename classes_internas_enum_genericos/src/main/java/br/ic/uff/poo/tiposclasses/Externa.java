/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ic.uff.poo.tiposclasses;

/**
 *
 * @author vania
 */
public class Externa {
    private int valor;
    private static int valorEstatico;
    
    public Externa(int valor){
        this.valor = valor;
    }
    
    public class Aninhada{
        public void exibir(){
            System.out.println("valor ="+valor);
        }
    }
    
    public static class AninhadaEstatica{
        public void exibir(){
            System.out.println("valor estático ="+valorEstatico);
        }
    }    
    
    
}
