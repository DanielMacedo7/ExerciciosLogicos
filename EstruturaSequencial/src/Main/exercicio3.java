/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
   de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
 
 */

package Main;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
    int a, b, c, d;
    
    System.out.print(" A : " );
	a = sc.nextInt();
    System.out.print(" B : " );
    b = sc.nextInt();
    System.out.print(" C : " );
    c = sc.nextInt();
    System.out.print(" D : " );
	d = sc.nextInt();
	
	double FormulaDiferenca = (a * b) - (c * d);
	
	System.out.println("Resultado Diferenca: " + FormulaDiferenca);
	
	sc.close();
	
	}

}
