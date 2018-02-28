package Exercico_20;

import java.util.Scanner;

public class Quest_15 {
    /**
     * Faça um algoritmo para ler um valor inteiro N e escrever os N primeiros
     * números primos. 
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n = ler.nextInt();
        int cont = 0, p;
        
        while(cont <= n){
            p = 0;
            for(int i = 1; i <= cont; i++){
                if(cont % i == 0){
                    p = p + 1;
                }
            }          
            if(p == 2){
                System.out.print(cont+ " ");
            }
            cont++;
        }
     
    }
}