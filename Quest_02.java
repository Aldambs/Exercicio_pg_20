package Exercico_20;

public class Quest_02 {
    /**
     * Faça um algoritmo para escrever os números pares de 1 a 1000.
     */
    public static void main(String[] args) {
       
        int i = 0;

        while( i <= 1000){
            if(i % 2 == 0)
            System.out.println(i);
            i = i + 2;
        }
    }   
}
