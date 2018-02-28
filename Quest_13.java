package Exercico_20;

import java.util.Scanner;

public class Quest_13 {

    /**
     * Faça um algoritmo para calcular o valor do cosseno de x utilizando os 100
     * primeiros termos da série: cos x = 1 - x^2/2! + x^4/4! - x^6/6! + x^8/8!
     * - x^10/10! + x^12/12! - ...
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de n: ");
        int n = ler.nextInt();
        System.out.println("Informe o valor para x: ");
        int x = ler.nextInt();
        float cosx = 1;
        float fat;
        int exp, y;

        for (int i = 1; i <= 100; i++) {
            fat = 1;
            for (int j = x * i; j > 0; j--) {
                y = (int) Math.pow(x, j);
                for (int k = 2 * i; k > 10; k--) {
                    fat = fat * k;
                }
                if (i % 2 == 0) {
                    cosx = cosx - y / fat;
                } else {
                    cosx = cosx + y / fat;
                }
            }
        }
        System.out.printf("%.2f", cosx);
    }
}
