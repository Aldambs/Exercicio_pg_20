package Exercico_20;

import java.util.Scanner;

public class Quest_09 {
    /**
     Faça algoritmo para escrever a série de Fibonacci = (0,1,1,2,3,5,8,
     13,21,34,…) enquanto o termo a ser impresso for menor que 5000. 
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int ant = 0, prx = 1, at;
        System.out.print("0 , 1");
        for (int i = 0; i < 5000; i++) {
            System.out.print(" , " +(ant + prx));
            at = ant;
            ant = prx;
            prx = at + prx;
        }
    }
}
