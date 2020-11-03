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
public class ClasseGenerica<T> {
    
    private String id;
    private T valor;
    
    public ClasseGenerica(String id, T valor){
        this.id = id;
        this.valor = valor;
    }
    
    public T getValor(){
        return valor;
    }

    
}
