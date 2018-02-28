package Exercico_20;

import java.util.Scanner;

public class Quest_17 {
    /**
     * Faça um algoritmo para  ler um código, descrição, estoque das mercadorias 
     * de um supermercado, onde o flag será um código igual a 0. Escreva o código
     * e a descrição das mercadorias como estoque abaixo do mínimo.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int cod, estM = 300, est;
        String desc;
        
        System.out.println("Informe o código:");
        cod = ler.nextInt();
        System.out.println("Informe a descrição:");
        desc = ler.next();
        System.out.println("Informe o estoque:");
        est = ler.nextInt();
        
        while(cod >= 0){
            
            if(est < estM){
                System.out.println("Código: "+cod);
                System.out.println("Descrição: "+desc);
                System.out.println("Estoque Atual: "+est);
                System.out.println("Abaixo do Minimo");
            }else{
                System.out.println("Código: "+cod);
                System.out.println("Descrição: "+desc);
                System.out.println("Estoque Atual: "+est);
                System.out.println("Acima do mínimo!");                        
            }
            break;
        }
    }
    
}
