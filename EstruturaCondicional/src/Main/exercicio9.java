/* Leia 2 valores inteiros (A e B). Após, 
 * o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
   Multiplos", indicando se os valores lidos
   são múltiplos entre si. Atenção: os números devem poder ser digitados em 
   ordem crescente ou decrescente. 
 */

package Main;

import java.util.Scanner;

public class exercicio9 {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int A, B;
	
	
	System.out.print("A: ");
	A = sc.nextInt();
	
	System.out.print("B: ");
	B = sc.nextInt();
	
	double Multiplo = A / B;
	
// Para saber se um numero é multiplo apenas basta dividir A / B e verificar
// se o Resto da divisao será igual a 0.
    if(Multiplo % 2 == 0) {		
       System.out.print(" É Multiplo");
           	
    }else {
    	System.out.print("Nao É Multiplo");
    }
		
		
	sc.close();	
		
	}
	
}
