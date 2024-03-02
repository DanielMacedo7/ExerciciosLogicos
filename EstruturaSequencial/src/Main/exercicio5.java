/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
 * o valor unitário de cada peça 1, o 
   código de uma peça 2, o número de peças 2 e o 
   valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 * 
 * 
 */

package Main;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);	
 
    int codPeca1, codPeca2;
    int numPeca1, numPeca2;
    int valorPeca1, valorPeca2;
    
    System.out.print("Codigo Peça 1 : " );
    codPeca1 = sc.nextInt();
    
    System.out.print("Codigo Peça 2: ");
    codPeca2 = sc.nextInt();
    
    System.out.println("");
    
    System.out.print("Numero de Peças 1 : " );
    numPeca1 = sc.nextInt();
    
    System.out.print("Numero de Peças 2: " );
    numPeca2 = sc.nextInt();
    
    System.out.println("");
    
    System.out.println("Valor Peça 1: " );
    valorPeca1 = sc.nextInt();
    
    System.out.println("Valor Peça 2: " );
    valorPeca2 = sc.nextInt();
    
    double ValorAserPago1 = numPeca1 * valorPeca1;
    double ValorAserPago2 = numPeca2 * valorPeca2;
    
    System.out.println("Código da Peça 1:  " +  codPeca1 +  " / " +
    		" Valor a Ser Pago Pela Peça 1: " + ValorAserPago1 + "$");
    System.out.println("");
    System.out.println("Código da Peça 2: " + codPeca2 + " / " + 
    		" Valor a Ser Pago Pela Peça 2: " + ValorAserPago2 + "$");
    
    sc.close();
    
	}

}
