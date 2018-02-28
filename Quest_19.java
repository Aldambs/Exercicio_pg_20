package Exercico_20;

import java.util.Scanner;

public class Quest_19 {
    /**
     Faça um algoritmo para dado o valor de N calcular o valor de H.
     H = 1 + 1/2! + 1/3! + 1/4! + ... + 1/n!.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Informe o valor de n:");
        int n = ler.nextInt();
        float h;
        float fat;
        h = 0;
        for(int i = 1; i <= n; i++){
           fat = 1;
            for (int j = 2; j <= i; j++) {
                fat = fat * j;
                h = h + 1/fat;
            }
            
        }
        System.out.printf("%.4f", h);
    }
}
