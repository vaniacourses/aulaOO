package br.uff.ic.poo.produto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vania
 */
public class Produto {


    private String descricao;
    private float preco;
    
    public Produto(String descricao, float preco){
        this.descricao = descricao;
        this.preco = preco;
    }
        
    
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }
        
}
