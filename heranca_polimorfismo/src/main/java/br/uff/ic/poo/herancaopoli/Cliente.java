/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.poo.herancaopoli;

import br.uff.ic.poo.herancaopoli.Pessoa;

/**
 *
 * @author vania
 */
public class Cliente extends Pessoa {
    
    private Integer pontosFidelidade = 0;
    
    public void atualizaPontosFidelidade(Integer pontos){
        this.pontosFidelidade += pontos;
    }
    
    @Override
    public void imprimePessoa(){
        super.imprimePessoa();
        System.out.println("Pontos: "+ this.pontosFidelidade);          
        
    }
       
    
}
