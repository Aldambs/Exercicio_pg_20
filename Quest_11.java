package Exercicio_20;

import java.util.Scanner;

public class Quest_11 {

    /*
     Faça um algoritmo para dado o valor de N calcular o valor de H.
     H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int n = entrada.nextInt();
        float i, soma, h = 0;

        if (n <= 0) {
            System.out.println("Valor inválido!");
        }else{
            for (i = 1; i <= n; i = i+1) {
                soma = 1 / i;
                h = h + soma;
            }
            System.out.printf("%.4f", h);
        }
    }
}
