/* Ler um número inteiro N e calcular todos os seus divisores
 * 
 */

package Main;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("N: ");
	int N = sc.nextInt();
	
	for(int i = 1; i <= N; i++) {
	double c = (double) N / i;
	System.out.printf("N: " + N + " / " + i + " = " + " %.1f%n" ,c);
	
	sc.close();

	}
  }
	
}
/*

*/