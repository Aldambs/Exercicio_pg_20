package Exercico_20;

import java.util.Scanner;

public class Quest_03 {
    /**
     * Faça um algoritmo para ler dois números inteiros representando um 
     * intervalo fechado e escrever em ordem crescente todos os números
     * ímpares do intervalo. 
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);  
        int n1, n2;
        
        System.out.println("Digite o 1° número:");
        n1 = ler.nextInt();
        System.out.println("Digite o 2° número:");
        n2 = ler.nextInt();

        while(n1 < n2){
            n1++;
            if(n1 % 2 != 0){
                System.out.println(n1);
            }
        }
        while(n2 < n1){
            n2++;
            if(n2 % 2 != 0){
                System.out.println(n2);
            }
        }
    }
    
}
