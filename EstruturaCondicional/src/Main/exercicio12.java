/*Você deve fazer um programa que leia um valor qualquer 
 *e apresente uma mensagem dizendo em qual dos 
  seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
  este valor se encontra. Obviamente se o valor não estiver em 
  nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”
 */

package Main;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int Number;
	 
	System.out.print("Valor Digitado: ");
	Number = sc.nextInt();
	
	if(Number >= 0 && Number <= 25) {
		System.out.println("Dentro do Intervalo de [0,25]");
	
	}else {
		if(Number >= 25 && Number <= 50) {
			System.out.println("Dentro do Intervalo de [25,50]");
		
			}else {
				if(Number >= 50 && Number <= 75) {
					System.out.println("Dentro do Intervalo de [50,75]");
			
				}else {
					if(Number >= 75 && Number <= 100) {
						 System.out.println("Dentro do Intervalo de [75,100]");
				
					}else {
							System.out.println("Fora do Intervalo");
				}
			}
		}
	
	}
		
	sc.close();
	
	}
	
}


