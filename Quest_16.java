package Exercico_20;

import java.util.Scanner;

public class Quest_16 {
    /**
     * Faça um algoritmo para ler um número inteiro e derar outro número inteiro
     * formado pelos digitos invertidos do número lido. Ex: NúmeroLido = 12345; 
     * NumeroGerado = 54321. Dica: obs. os resultados das funções quociente e
     * resto de um número por 10.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número:");
        int n = ler.nextInt();
        int n1 = 0;
        
       while(n > 0){
            n1 = n1 * 10;
            n1 = n1 + (n % 10);
            n = n / 10;
            System.out.println("O invertido é: " +n1);
        }
    }
    
}
