/* Fazer um programa para ler uma temperatura em Celsius e mostrar
 * o equivalente em Fahrenheit. Perguntar se o usuário deseja repetir
 * (s/n).Caso o usuário digite "s", repetir o programa.
 * 
 * Fórmula: F = 9 * C / 5 + 32
 *   
 */

package Main;

import java.util.Scanner;

public class doWhileBonus {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	char resp;
	
	do {
	System.out.print("Digite a Temperatura em Celsius: ");
	double C = sc.nextDouble();
	double F = 9.0 * C / 5.0 + 32;
	System.out.println("Equivalente em Fahrenheit: " + F);
	System.out.println("Deseja Repetir (s/n)");
	resp = sc.next().charAt(0);	
	}while(resp != 'n');
	
	sc.close();
	}

}
