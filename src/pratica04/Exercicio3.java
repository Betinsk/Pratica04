package pratica04;
import java.util.Scanner;

/*
 3) Em linguagem de programação Java, escreva um algoritmo para a prefeitura de uma
cidade que deseja realizar uma pesquisa entre os seus habitantes. A prefeitura irá
coletar dados sobre o salário e o número de filhos da população. A prefeitura deseja
saber:
a. A média salarial da população.
b. A média do número de filhos.
O final da leitura de dados dar-se-á com a entrada de um salário negativo.
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

			System.out.println("Digite seu salário:");
			salario = sc.nextDouble();
			mediaSalario += salario;
			System.out.println("Digite o número de filhos:");
			numeroFilhos = sc.nextInt();
			mediaFi += numeroFilhos;
			count++;

			double media = mediaSalario / count;
			System.out.printf("Media salarial da população %.2f%n", media);
			double mediaFilho = (double) mediaFi / count;
			System.out.printf("Media de filhos da população %.1f%n", mediaFilho);
			System.out.println();

		}

		sc.close();
	}

}
