package pratica04;
import java.util.Scanner;

/*
 3) Em linguagem de programa��o Java, escreva um algoritmo para a prefeitura de uma
cidade que deseja realizar uma pesquisa entre os seus habitantes. A prefeitura ir�
coletar dados sobre o sal�rio e o n�mero de filhos da popula��o. A prefeitura deseja
saber:
a. A m�dia salarial da popula��o.
b. A m�dia do n�mero de filhos.
O final da leitura de dados dar-se-� com a entrada de um sal�rio negativo.
 */

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salario = 0;
		double mediaSalario = 0;
		int count = 0;
		int numeroFilhos = 0;
		int mediaFi = 0;

		while (salario >= 0) {

			System.out.println("Digite seu sal�rio:");
			salario = sc.nextDouble();
			mediaSalario += salario;
			System.out.println("Digite o n�mero de filhos:");
			numeroFilhos = sc.nextInt();
			mediaFi += numeroFilhos;
			count++;

			double media = mediaSalario / count;
			System.out.printf("Media salarial da popula��o %.2f%n", media);
			double mediaFilho = (double) mediaFi / count;
			System.out.printf("Media de filhos da popula��o %.1f%n", mediaFilho);
			System.out.println();

		}

		sc.close();
	}

}
