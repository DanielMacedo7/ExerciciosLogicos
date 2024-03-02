/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
   de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
   ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
   Se o ponto estiver na origem, escreva a mensagem “Origem”.
   Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for. 
 */

package Main;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	double x, y;	
		
	System.out.print("X : ");
	x = sc.nextDouble();
	
	//para deixar um espaço entre as coordenadas
	System.out.println("");
	
	System.out.print("Y : ");
	y = sc.nextDouble();
	
	if(x == y && y == 0) {
		System.out.println("Origem");
	}else {
		if(x == y && x > 0 && y == x && y > 0) {
			System.out.println("Q1");
		}else {
			if(x > y && x > 0 && y < x && y > 0) {
				System.out.println("Q4");
			}
		}
	}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();

	}

}
