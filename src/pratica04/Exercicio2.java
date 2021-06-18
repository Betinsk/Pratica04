package pratica04;
import java.util.Locale;
import java.util.Scanner;

/*2) Foi realizada uma pesquisa de audiência de canal de TV em várias casas de uma cidade,
em um determinado dia. Para cada casa consultada, foram fornecidos: o número do
canal (4,5,7,12) e o número de pessoas que estavam assistindo àquele canal. Em
linguagem de programação Java, escreva um algoritmo que:
a. Leia um número indeterminado de dados: número do canal e número de
pessoas assistindo o canal.
b. Calcule e apresente o percentual de audiência de cada canal.
c. Encerre o processamento quando o usuário informar o número do canal igual
a ZERO. 
*/

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numeroCanal = 1;
		int pessoas = 0;
		int canal4 = 0;
		int canal5 = 0;
		int canal7 = 0;
		int canal12 = 0;

		while (numeroCanal > 0) {
			System.out.println("Numero do canal (4,5,7,12): ");
			numeroCanal = sc.nextInt();

			if (numeroCanal == 4) {
				System.out.println("Pessoas assistindo o canal: ");
				pessoas = sc.nextInt();
				canal4 += pessoas;
			}

			if (numeroCanal == 5) {
				System.out.println("Pessoas assistindo o canal: ");
				pessoas = sc.nextInt();
				canal5 += pessoas;
			}

			if (numeroCanal == 7) {
				System.out.println("Pessoas assistindo o canal: ");
				pessoas = sc.nextInt();
				canal7 += pessoas;
			}

			if (numeroCanal == 12) {
				System.out.println("Pessoas assistindo o canal: ");
				pessoas = sc.nextInt();
				canal12 += pessoas;
			}

			System.out.println("Pessoas Assistindo canal 4: " + canal4);
			System.out.println("Pessoas Assistindo canal 5: " + canal5);
			System.out.println("Pessoas Assistindo canal 7: " + canal7);
			System.out.println("Pessoas Assistindo canal 12: " + canal12);
			System.out.println();

		}

		sc.close();

	}

}
