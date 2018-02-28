package Exercico_20;

import java.util.Scanner;

public class Quest_18 {

    /**
     * Faça um algoritmo para apurar o resultado do segundo turno da eleição
     * para prefeito de uma determinada cidade. O algoritmo deverá ler o nome
     * dos dois candidatos, em seguida todas as zonas, onde o Flag será o valor
     * 0 e para cada zona todas as suas secções (flag secção = 0) e 
     * para cada
     * secção serão lidos os nomes de cada candidato e seu número de votos. O
     * algoritmo deverá escrever o nome e o percentual de votos de cada
     * candidato.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);

        int zona, seccao, cont,j;
        String cand1, cand2;
        int soma1, votosCand1, soma2, votosCand2;
        double porc1, porc2;

        System.out.println("Informe o nome do 1º candidato:");
        cand1 = ler.nextLine();
        System.out.println("Informe o nome do 2º candidato:");
        cand2 = ler.nextLine();
        
        zona = 1;        
        cont = 1;
        soma1 = 1;
        soma2 = 1;
        while(zona != 0){
            System.out.println("Informe a zona:");
            zona = ler.nextInt();
            if(zona != 0){
                cont = cont + 1;
                seccao = 1;
                j = 1;
                while(seccao != 0){
                    System.out.println("Informe a seccao:");
                    seccao = ler.nextInt();
                    if(seccao != 0){
                        j = j + 1;
                        System.out.println("Informe o voto do candidato 1:");
                        votosCand1 = ler.nextInt();
                        System.out.println("Informe o voto do candidato 2:");
                        votosCand2 = ler.nextInt();
                        soma1 = soma1 + votosCand1;
                        soma2 = soma2 + votosCand2;
                         break;
                    }
                }
            }
            if(soma1 + soma2 != 0){
                porc1 = soma1 * 100 / (soma1 + soma2);
                porc2 = 100 - porc1;
                System.out.println(cand1);
                System.out.println(porc1);
                System.out.println(cand2);
                System.out.println(porc2);
                
                break;
            }         
        }
        
        System.out.println("FIM");
    }
}
