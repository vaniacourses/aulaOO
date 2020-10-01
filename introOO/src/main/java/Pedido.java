/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vania
 */
public class Pedido {
    
    Cliente cliente;
    Item[] itens = new Item[100];
    int qtdeItens = 0;
    
    float getTotal(){
        float total = 0;
        for (int i=0;i<qtdeItens;i++){
            total += itens[i].getSubTotal();
        }
        return total;
    }
    
    void addItem(Produto prod, int qtde){
        Item item = new Item();
        item.produto = prod;
        item.quantidade = qtde;
        itens[qtdeItens] = item;
        qtdeItens++;        
    }
    
}
