/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.poo.main;

import br.uff.ic.poo.herancaopoli.Cliente;
import br.uff.ic.poo.herancaopoli.Funcionario;
import br.uff.ic.poo.herancaopoli.Pessoa;

/**
 *
 * @author vania
 */
public class Main {
    
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNome("Vania");
        cliente.atualizarContato("Rua dos Bobos", "1234-5678", "vania@ic.uff.br");
        cliente.atualizaPontosFidelidade(50);
        cliente.imprimePessoa();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Joao");
        funcionario.atualizarContato("Rua dos Funcionario", "3456-5678", "funcionario@ic.uff.br");
        funcionario.imprimePessoa();
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.atualizarContato("End Maria", "3456-4534", "maria@ic.uff.br");
        pessoa.imprimePessoa();

   }
    
}
