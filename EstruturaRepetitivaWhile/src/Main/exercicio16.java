/*Escreva um programa para ler as coordenadas (X,Y)
 *  de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 
O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma
 */
package Main;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("X: ");
	int x = sc.nextInt();
	
	System.out.println("Y: ");
	int y = sc.nextInt();
	
	while(x != 0 && y != 0) {
		if(x > 0 && y > 0) {
			System.out.println("Primeiro");
			x = sc.nextInt();
			y = sc.nextInt();
		}else
			if(x < 0 && y > 0) {
			 System.out.println("Segundo");
			 x = sc.nextInt();
			 y = sc.nextInt();
		}else {
			  if(x < 0 && y < 0) {
				System.out.println("Terceiro");
				x = sc.nextInt();
				y = sc.nextInt();
			}else 
				if(x > 0 && y < 0) {
					System.out.println("Quarto");
					x = sc.nextInt();
					y = sc.nextInt();
			}
		 }
	 }
	
		System.out.println("Nulo");
		sc.close();
	
  }
}