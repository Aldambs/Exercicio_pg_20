package Exercico_20;

import java.util.Scanner;

public class Quest_04 {
    /**
     * Faça um algoritmo para ler 100 números inteiros e escrever a soma e a
     * média dos números lidos. 
     */
    public static void main(String[] args) {
        
        Scanner ent = new Scanner (System.in);
        double soma = 0, med = 0, qtd = 0;
    
        for (int i = 1; i <= 100; i++){
             System.out.print("Digite o número:");
             int num = ent.nextInt();
             if(i > num){
                qtd++; 
             }
             soma = soma + num;
             med = soma / qtd;
        }
          System.out.println("A soma é: " +soma+ " \nA média é: " +med) ;
    }
    
}
