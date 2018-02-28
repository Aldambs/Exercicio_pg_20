package Exercico_20;

import java.util.Scanner;

public class Quest_10 {
    /**
     * Faça um algoritmo para ler um número inteiro positivo e escreva o seu fatorial.
     */
    public static void main(String[] args) {    
        Scanner ler = new Scanner(System.in);
        int n, fat = 1;
        
        System.out.println("Digite um número:");
        n = ler.nextInt();

        for(int i = 1; i <= n; i++){
                fat = fat * i; 
        }
        System.out.println("O fatorial é: "  + fat);  
    }
}
