/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.ic.poo.main;

import br.ic.uff.poo.animais.Animal;
import br.ic.uff.poo.animais.Cachorro;
import br.ic.uff.poo.animais.Galinha;
import br.ic.uff.poo.animais.Gato;
import br.ic.uff.poo.animais.Leao;
import br.ic.uff.poo.animais.Passaro;
import br.ic.uff.poo.animais.Pato;
import java.util.ArrayList;

/**
 *
 * @author vania
 */
public class MainAnimal {
    
    public static void main(String[] args){
        ArrayList<Animal> animais = new ArrayList<Animal>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Pato());
        animais.add(new Galinha());
        animais.add(new Leao());
        animais.add(new Passaro());
        
        for (Animal animal: animais){
            animal.fazerRuido();
            animal.comer("carne");
        }
        
        Animal a = new Animal();
        a.comer();
        a.comer("carne");
        a.comer("milho", 3);


    }
    

    
}
