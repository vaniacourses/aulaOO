/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ic.uff.br.poo.main;

import br.ic.uff.poo.tiposclasses.ClasseGenerica;
import br.ic.uff.poo.tiposclasses.ClassePai;
import br.ic.uff.poo.tiposclasses.Externa;
import br.ic.uff.poo.tiposclasses.Interface;

/**
 *
 * @author vania
 */
public class Main {
    
    public static void main(String[] args){
        Externa externa = new Externa(10);
        
        //para instanciar a classe interna
        Externa.Aninhada aninhada = externa.new Aninhada();
        
        aninhada.exibir();
        
        Externa.AninhadaEstatica aninhadaEstatica = new Externa.AninhadaEstatica();
        aninhadaEstatica.exibir();
        
        ClassePai cp = new ClassePai("Teste"){
            @Override
            public String getDescricao(){
                return "Classe Anônima";
            }
        };
        System.out.println(cp.getDescricao());
        
        Interface anonima = () -> {
            System.out.println("Classa anônima com interface");
        };
        anonima.getDescricao();
        
        ClasseGenerica<Integer> cg = new ClasseGenerica<Integer>("23", 5);
        System.out.println(cg.getValor());

    }
}
