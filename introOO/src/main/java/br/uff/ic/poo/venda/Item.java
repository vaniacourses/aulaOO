package br.uff.ic.poo.venda;

import br.uff.ic.poo.produto.Produto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vania
 */
public class Item {
    Produto produto;
    int quantidade;
    
    float getSubTotal(){
        return produto.getPreco() * quantidade;
    }
    
}
