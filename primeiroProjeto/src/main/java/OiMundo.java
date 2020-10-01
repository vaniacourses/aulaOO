
import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vania
 */
class OiMundo {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int idade;
        String nome;
                
        
        System.out.println("Digite a sua idade");
        idade = teclado.nextInt();
        
        System.out.println("Digite o seu nome");
        nome = teclado.next();
        
        System.out.println("O seu nome é "+ nome +" e a sua idade é"+ idade);
    }
    
    
}
