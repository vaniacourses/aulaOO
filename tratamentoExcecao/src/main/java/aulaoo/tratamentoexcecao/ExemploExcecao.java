/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaoo.tratamentoexcecao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 *
 * @author vania
 */
public class ExemploExcecao {
    
    public static void main(String[] args){
        try{
            metodoB();           
        }
        catch(MinhaExcecaoVerificadaException ex){
            System.out.println(ex.getMessage());
        }
        catch(MinhaExcecaoNaoVerificadaException ex){
            System.out.println(ex.getMessage());
        }        
        
        
        System.out.println("Código importante");  

    }  
    
    public static void metodoB() throws MinhaExcecaoVerificadaException{
        metodoA();
    }
    
    public static void metodoA() throws MinhaExcecaoVerificadaException, MinhaExcecaoNaoVerificadaException{
        lancaExcecaoManual();
        lancaExcecaoVerificadaManual();
    }

    public static void lancaExcecaoManual(){
        throw new MinhaExcecaoNaoVerificadaException("Acontece a minha exceção não verificada");
    }
    
    public static void lancaExcecaoVerificadaManual() throws MinhaExcecaoVerificadaException{
        throw new MinhaExcecaoVerificadaException();
    }    
   
    public static void testaTryAninhado(){
        int[] numerador = {4 , 8, 16, 32, 64, 128, 256, 512};
        int[] denominador = {2, 0, 4, 4, 0, 8};
        
        try{
          for (int i=0; i< numerador.length; i++){
              try{
                System.out.println(numerador[i]/denominador[i]);    
              }
             catch(ArithmeticException e){
               System.out.println("Não é possível dividir por zero"); 
             }                           
          }          
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Acesso a um índice inexistente");
        }
      
    }
    
    public static int testaExcecao(){
        try{
            int[] vetor = new int [5];             
            vetor[4] = 10;
            int a = 10;
            int b = 0;
            double divisao = a/b;
            System.out.println("Depois da exceção");        
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Acesso a um índice inexistente");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(ArithmeticException e){
           System.out.println("Não é possível dividir por zero"); 
        }
        catch(Exception e){
           System.out.println("Ocorreu um erro");
           System.out.println(e.getMessage());
           e.printStackTrace();      
        } 
        finally{
            System.out.println("Bloco finally");
        } 
        return 0;
       
    }

}
