/* Leia 1 valor inteiro N, que representa o número de casos
 * de teste que vem a seguir. Cada caso de teste consiste 
   de 3 valores reais, cada um deles com uma casa decimal.
   Apresente a média ponderada para cada um destes 
   conjuntos de 3 valores, sendo que o primeiro valor 
   tem peso 2, o segundo valor tem peso 3 e 
   o terceiro valor tem peso 5 
 */

package Main;

import java.util.Scanner;

public class exercicio20 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int x;
	
	System.out.println("X: ");
	x = sc.nextInt();
	
	for(int i = 0; i <= x; i++) {
	float produto1 = sc.nextFloat();
	float produto2 = sc.nextFloat();
	float produto3 = sc.nextFloat();
	float mediaPonderada = (produto1 + produto2 + produto3)
			/(produto1 + produto2 + produto3);
	System.out.println("Media Ponderada: " + mediaPonderada);
	}
		
	sc.close();
	}

}
