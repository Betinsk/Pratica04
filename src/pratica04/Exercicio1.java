package pratica04;
import java.util.Locale;
import java.util.Scanner;

/*
	 1) Em linguagem de programação Java, escreva um algoritmo que receba a nota final e o
	total de faltas de um conjunto indeterminado de alunos. Imprima:
	a. A quantidade de alunos que obtiveram nota final maior ou igual a 90.
	b. A quantidade de alunos que foram reprovados por nota (nota menor que 70)
	ou por falta (quantidade de faltas maior ou igual a 20).
	c. A maior e a menor nota.
	d. A média de notas da turma.
	O programa deverá terminar quando o usuário informar uma nota negativa.
	 */

public class Exercicio1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double notaFinal = 0;
		int notaMaiorNoventa = 0;
		int notaMenorQueSetenta = 0;
		double maiorNota = 0;
		double menorNota = 0;
		double media = 0;
		double countNotas = 0;

		while (notaFinal >= 0) {

			System.out.print("Digite a nota Final do aluno: ");
			notaFinal = sc.nextDouble();

			countNotas++;
			media += notaFinal;

			if (notaFinal > maiorNota) {
				maiorNota = notaFinal;
			}
			if (notaFinal < maiorNota) {
				menorNota = notaFinal;
			}
			System.out.println("Quantidade de faltas: ");
			int totalFaltas = sc.nextInt();

			if (notaFinal >= 90) {
				notaMaiorNoventa++;
			}
			System.out.println("Alunos que obtiveram nota final maior ou igual a 90 = " + notaMaiorNoventa);

			if (notaFinal < 70 || totalFaltas >= 20) {
				notaMenorQueSetenta++;
			}
			System.out.println("Alunos que foram reprovados por nota nota menor que 70 ou mais de 20 faltas = " + notaMenorQueSetenta);
			System.out.printf("Maior nota %s e menor nota %s %n", maiorNota, menorNota);

			double mediaTotal = media / countNotas;
			System.out.printf("Média de notas da turma %.2f%n", mediaTotal);
			System.out.println();
		}

		sc.close();

	}
}
