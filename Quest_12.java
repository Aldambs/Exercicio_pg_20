package Exercico_20;

import java.util.Scanner;

public class Quest_12 {

    /**
      Faça um algoritmo para calcular o valor da série, para 100 termos. S = 0
      + 1/2! - 2/4! + 3/6! - 4/8! +5/10! - 6/12! + ..., utilizando 100 termos.
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float s = 0;
        float fat;
        
        System.out.println("Entre com a quantidade de termos da série: ");
        int ter = leitura.nextInt();
        
        for (int i = 1; i <= ter; i++) {
            fat = 1;
            for (int j = 2 * i; j > 0; j--) {
                fat = fat * j;
            }
            if (i % 2 == 0) {
                s = s - i / fat;
            } else {
                s = s + i / fat;
            }
        }
        System.out.printf("%.4f", s);
    }
}
