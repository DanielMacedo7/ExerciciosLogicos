/*  Fazer um programa para ler um número inteiro,
 * e depois dizer se este número é negativo ou não
 * 
 */

package Main;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
 int number;
 
 System.out.print("Numero: ");
 number = sc.nextInt();
 
 
 if(number > 0 ) {
	 System.out.println("Positivo");
	 
 }else {
	 
	 System.out.println("Negativo");
	 
 }
  
  sc.close();
		
	}

}
