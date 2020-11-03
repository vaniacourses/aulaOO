/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ic.uff.poo.animais;

/**
 *
 * @author vania
 */
public class Cachorro extends Animal implements Domesticavel{

    @Override
    public void fazerRuido() {
        System.out.println("au au");
    }

    @Override
    public void brincar() {
        System.out.println("Cachorro está brincando");
    }

    @Override
    public void serAmigavel() {
        System.out.println("Cachorro quer carinho");
    }

    
    
  
}
