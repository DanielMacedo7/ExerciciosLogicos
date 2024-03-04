/* Ler um valor N. Calcular e escrever seu respectivo fatorial.
 *  Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 *  Lembrando que, por definição, fatorial de 0 
 */

package Main;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N : ");
		int N = sc.nextInt();
		
		//Era necessário essa variável pois se calculasse N * 1 
		//Não chegaria ao resultado correto 
		
		int fat = 1;
		for(int i = 1; i <= N; i++) {
		fat *= i;
		
		System.out.println("Fatorial de: " + N  + "=" 
		+ fat);
		
		}	
		
		sc.close();
		
	}

}
