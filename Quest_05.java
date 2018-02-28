package Exercico_20;

import java.util.Scanner;

public class Quest_05 {
    /**
     * Faça um algoritmo para ler um valor N e em seguida ler N números inteiros
     * e escrever o maior número lido.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = 0,  cont = 0;
        
        System.out.println("INFORME O NÚMERO: ");
        int n = input.nextInt(); 
        maior = n;
        
        while(cont != n){
            System.out.print("INFORME O VALOR:");
            int num = input.nextInt();
            
            if(num > maior){
                maior = num;
            }
            cont++;
        }
        System.out.println("O maior número é: " +maior);
    }
}
