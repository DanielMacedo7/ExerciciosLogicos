/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada, 
escrever a mensagem "Senha Invalida". Quando a senha for informada 
corretamente deve ser impressa a mensagem "Acesso Permitido" 
e o algoritmo encerrado. Considere que a senha correta é o valor 2002

*/
package Main;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
  Scanner leia = new Scanner(System.in);
  
  System.out.println("Digite sua Senha: ");
  int Senha = leia.nextInt();
  
  while(Senha != 2002) {
	  System.out.println("Acesso Negado");
	  Senha = leia.nextInt();
	}
      System.out.println("Acesso Permitido");	
  	
  
	leia.close();
	
	}
	
}
