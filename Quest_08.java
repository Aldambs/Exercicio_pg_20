package Exercico_20;

import java.util.Scanner;

public class Quest_08 {

    /**
      Faça um algoritmo para ler o nome, sexo ("M" =Masculino e "F"=Feminino),
      três notas e o número de faltas dos alunos de uma turma, onde o Flag será
      um nome igual a "fim", e escrever:
      a. A média e a situação final de cada aluno; 
      b. A média das notas dos homens e a média das notas das mulheres;
      c. O percentual de homens e o percentual de mulheres reprovados por média; 
      d. O percentual de homens e o percentual de mulheres reprovados por falta;
      e. O percentual geral de reprovação da turma.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = null;
        char sexo;
        double n1, n2, n3;
        double med, medF = 0, medM = 0;
        double percF = 0, percM = 0, percF2 = 0, percM2 = 0, perc = 0;
        int i, falta;
              
        System.out.println("Digite o nome do aluno:");
        nome = ler.nextLine();
        System.out.println("Digite o genero do aluno:");
        sexo = ler.next().charAt(0);
        System.out.println("Digite a 1° nota:");
        n1 = ler.nextDouble();
        System.out.println("Digite a 2° nota:");
        n2 = ler.nextDouble();
        System.out.println("Digite a 3° nota:");
        n3 = ler.nextDouble();
        System.out.println("Digite o n° de faltas:");
        falta = ler.nextInt();

        med = ((n1 + n2 + n3) / 3) + 1;

        if ((med >= 5) && (falta <= 27)) {
            System.out.println("Aluno: \n" + nome);
            System.out.println("Média: \n" + med);
            System.out.println("Sexo: \n" + sexo);
            System.out.println("ESTA APROVADO!\n");
        } else {
            System.out.println("Aluno: \n" + nome);
            System.out.println("Média: \n" + med);
            System.out.println("Sexo: \n" + sexo);
            System.out.println("ESTA REPROVADO! \n");
        }
        if (sexo == 'M' || sexo == 'm'){        
            medM = (medM + med);
        }
        if (sexo == 'F' || sexo == 'f') {
            medF = (medF + med);
        }
        if ((sexo == 'M' || sexo == 'm') && (med < 5 || falta > 27)) {
            percM2 = percM2 + 1;
            percM = (percM2 * 100) / medM;
        }
        if ((sexo == 'F' || sexo == 'f') && (med < 5 || falta > 27)) {
            percF2 = percF2 + 1;
            percF = (percF2 + 100) / medF;
        }
        if((med < 5) || (falta > 27)){
            perc = ((percM2 + percF2) * 100)/(medM + medF);
        }
        
        System.out.println("Média das notas dos homens: \n" +medM);
        System.out.println("Média das notas das mulheres: \n" +medF);
        System.out.println("Percentual de homens reprovados por média: \n" +percM);
        System.out.println("Percentual de mulheres reprovados por média: \n" +percF);
        System.out.println("Percentual de homens reprovados por faltas: \n" +percM2);
        System.out.println("Percentual de mulheres reprovados por faltas: \n" +percF2);
        System.out.println("Percentual geral de reprovação da turma: \n" +perc);
    }
}
