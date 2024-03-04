 /*  Leia Um Valor N e faça uma tabuada a partir desse valor
 */
package Main;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("N : ");
	int N = sc.nextInt();
	
	for(int i = 0; i <= N; i++) {
	   i *= 1;
	   int c = N * i;
	   System.out.println("Fatorial de: " + N  +  " x " + i + " = " + c);
	}

	sc.close();
	}

}
