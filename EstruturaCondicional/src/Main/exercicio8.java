/* Fazer um programa para ler um número inteiro 
 * e dizer se este número é par ou ímpar
 * 
 */

package Main;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);		

    int number;
    
    System.out.print("Numero: ");
    number = sc.nextInt();
    
    
    // para saber se um número é par ou não.
    if(number % 2 == 0) {
    	System.out.print("Par");
    
    }else {
    	System.out.print("Impar");
    }
    
    sc.close();
    
      }
    
}


