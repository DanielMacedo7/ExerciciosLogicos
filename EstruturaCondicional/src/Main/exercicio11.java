/* Com base na tabela abaixo, 
 * escreva um programa que leia o código de um item 
 * e a quantidade deste item. A 
   seguir, calcule e mostre o valor da conta a pagar
 
 */

package Main;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	

	// Cachorro Quente / Preço R$4.00 ; 
	// X-Salada / Preço R$4.50
	// X-Bacon / Preço R$5.00
	// Torrda Simples / Preço R$2.00
	// Refrigerante / Preço R$1.50
	
	int CodigoItem;
	int QuantidadeItem;
	double Preco1 = 4.00, Preco2 = 4.50, Preco3 = 5.00, Preco4 = 2.00, 
		   Preco5 = 1.50;
	
	double ValorDaConta;
	
	System.out.println("Codigo do Item : ");
	CodigoItem = sc.nextInt();
	
	System.out.println("Quantidade : ");
	QuantidadeItem = sc.nextInt();
	
	if(CodigoItem == 1) {
		ValorDaConta = QuantidadeItem * Preco1;
		System.out.println("Cachorro Quente : " + QuantidadeItem);
		System.out.println("Valor Da Conta: " + ValorDaConta + "$");		
	}else {
		if(CodigoItem == 2) {
			ValorDaConta = QuantidadeItem * Preco2;
			System.out.println("X-Salada : " + QuantidadeItem);	
			System.out.println("Valor Da Conta: " + ValorDaConta + "$");
		}else {
			if(CodigoItem == 3) {
				ValorDaConta = QuantidadeItem * Preco3;
				System.out.println("X-Bacon : " + QuantidadeItem);	
				System.out.println("Valor Da Conta: " + ValorDaConta + "$");
			}else {
				if(CodigoItem == 4) {
					ValorDaConta = QuantidadeItem * Preco4;
					System.out.println("Torrada Simples: " + QuantidadeItem);	
					System.out.println("Valor Da Conta: " + ValorDaConta + "$");
				}else {
					if(CodigoItem == 5) {
						ValorDaConta = QuantidadeItem * Preco5;
						System.out.println("Refrigerante : " + QuantidadeItem);	
						System.out.println("Valor Da Conta: " + ValorDaConta + "$");
					}else {
						if(CodigoItem > 5) {
							System.out.println(" Opção Inválida ");
						}
						
					}
				}
			}
			
		}
	}
	
	sc.close();
	
	
	}

}
