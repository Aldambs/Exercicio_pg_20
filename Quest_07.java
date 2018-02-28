package Exercico_20;

import java.util.Scanner;

public class Quest_07 {

    /**
     * Faça uma algoritmo para ler salários, onde o Flag será um salário igual a
     * 0 (zero) e escreva, em ordem crescente, os três maiores valores dos
     * salários lidos.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double salario;
        double salario1;
        double salario2;
        double salario3;
        
        System.out.println("Informe o salário:");
        salario = ler.nextDouble();
        System.out.println("Informe o 1° salário:");
        salario1 = ler.nextDouble();
        System.out.println("Informe o 2° salário:");
        salario2 = ler.nextDouble();
        System.out.println("Informe o 3° salário:");
        salario3 = ler.nextDouble();
        
        while (salario == 0) {
            if (salario > salario1) {
                salario3 = salario2;
                salario2 = salario1;
                salario1 = salario;
            } else if ((salario < salario1) && (salario > salario2)) {
                salario3 = salario2;
                salario2 = salario;
            } else if ((salario < salario2) && (salario > salario3)) {
                salario3 = salario;
            }
            
        }
        System.out.println(" Salario 1: " + salario1);
        System.out.println(" Salario 2: " + salario2);
        System.out.println(" Salario 3: " + salario3);
    }
}
