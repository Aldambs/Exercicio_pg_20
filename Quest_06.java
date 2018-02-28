package Exercico_20;

import java.util.Scanner;

public class Quest_06 {

    /**
     * Faça um algoritmo para ler números inteiros, onde o Flag será o valor 0 e
     * sem seguida escrever o menor valor lido e quantas vezes este ocorreu nos
     * números lidos.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o número e pra sair digite 0: ");
        int num = ler.nextInt();
        int menor = num;
        int cont = 0;
        while (num != 0) {
            if (num < menor) {
                menor = num;
                cont = 1;
            } else if (menor == num) {
                cont++;
            }
            System.out.print("Informe o número e pra sair digite 0: ");
            num = ler.nextInt();
        }
        if (cont > 0) {
            System.out.print("O menor número é: " + menor + " \nEle repetiu: " + cont);
        } else {
            System.out.print("Nenhum número informado!!");
        }
    }
}
