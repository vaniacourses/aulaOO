package br.uff.ic.poo.venda;

import br.uff.ic.poo.produto.Produto;
import br.uff.ic.poo.cliente.Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vania
 */
public class Caixa {
    
    public static void main(String[] args){
        
        Cliente cliente = new Cliente("Joao da Silva", "Rua dos Bobos, número zero");
       
        Produto acucar = new Produto("Acucar", 2);      
        Produto macarrao = new Produto("Macarrao", (float) 2.5);        
        Produto feijao = new Produto("Feijao", 3);

        
        Pedido pedido = new Pedido(cliente);
        pedido.addItem(acucar, 5);
        pedido.addItem(macarrao, 2);
        pedido.addItem(feijao, 3);
        
        System.out.println("O total do pedido é: "+ pedido.getTotal());
        
        
        
        
                
        
        
       
    }
    
}
