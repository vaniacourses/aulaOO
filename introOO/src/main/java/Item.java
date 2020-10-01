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
        return produto.preco * quantidade;
    }
    
}
