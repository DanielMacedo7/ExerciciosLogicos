/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
   mensagem explicativa, conforme exemplos
 */

package Main;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 int n1, n2;
 
 System.out.println("Informe o Valor de N1: ");
 n1 = sc.nextInt();
		
 System.out.print("Informe o Valor de N2: ");
 n2 = sc.nextInt();
 
 int soma = n1 + n2;
 
 System.out.println("Soma:  " + soma);
 
 sc.close();		
		
		

	}

}
