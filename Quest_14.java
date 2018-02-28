package Exercico_20;

import java.util.Scanner;

public class Quest_14 {
    /**
     * Faça um algoritmo para ler um número inteiro positivo e informar se este 
     * número é primo ou não.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número:");
        int n = ler.nextInt();
        int cont = 0;
        
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                cont = 1;
            }
        }
        if(cont == 0){
            System.out.println("É PRIMO!");
        }else{
            System.out.println("NÃO É PRIMO!");
        }
    }
    
}
