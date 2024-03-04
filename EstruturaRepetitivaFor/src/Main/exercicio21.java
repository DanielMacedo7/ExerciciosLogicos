/* Fazer um programa para ler um número N. 
 * Depois leia N pares de números e mostre a divisão do primeiro pelo 
   segundo. 
   Se o denominador for igual a zero,
   mostrar a mensagem "divisao impossivel" 
 */

package Main;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	

	System.out.println("N: ");
	int n = sc.nextInt();
	
	for(int i = 0 ; i < n; i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println( a +  "-"  + b);
		if(b == 0) {
			System.out.println("Divisao Impossivel");
			
		}else {
			 // essa linha divide o numero impar corretamente.
			 double c = (double) a / b;
		    //Lembrar que se eu for Printar float não preciso do + e sim ,
			System.out.printf("%.1f%n", c);
	
		}
		
	   
		
	}
	
	sc.close();
	
	}

}
