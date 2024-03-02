/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
   casas decimais conforme exemplos.
   Fórmula da área: area = π . raio2
   Considere o valor de π = 3.14159 
 */

package Main;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  double Pi = 3.14;
  double Raio;
  
  System.out.println("Valor do Raio: ");
  Raio = sc.nextDouble();
  
  double Formula = Pi * (Raio * Raio);
  
  System.out.println("Resultado: " + Formula);
  
  sc.close();
		
		
		
	}

}
