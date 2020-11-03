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
public class Pizza {
    
    private PizzaStatus status;
    public enum PizzaStatus {
        PEDIDA,
        PRONTA,
        ENTREGUE;    
    }    
    
    public boolean podeSerEntregue(){
        if (this.getStatus() == PizzaStatus.PRONTA){
            return true;
        }
        return false;
    }
    
    public PizzaStatus getStatus(){
        return this.status;
    }
}
