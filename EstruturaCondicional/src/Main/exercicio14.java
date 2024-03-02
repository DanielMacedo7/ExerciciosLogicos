/*Em um país imaginário denominado Lisarb, 
 *todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
  que nele não existem políticos corruptos e os recursos arrecadados 
  são utilizados em benefício da população, sem 
  qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
  Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
  Em seguida, calcule e 
  mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo
 * 
 *
 */

package Main;


import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double Salario;
	double Juros;
	
	System.out.println("Salario: ");
	Salario = sc.nextDouble();
	
	if(Salario >= 0.00 && Salario <= 2000.00) {
		System.out.println("Isento");
	}else {
		if(Salario >= 2000.01 && Salario <= 3000.00) {
			Juros = Salario * 0.08;
			System.out.println(" 8% De Juros:  " + Juros);
			
		}else {
			if(Salario >= 3000.01 && Salario <= 4500.00){
				Juros = Salario * 0.18;
				System.out.println(" 18% de Juros: " + Juros);
			}else {
				if(Salario > 4500.00) {
					Juros = Salario * 0.28;
					System.out.println(" 28% de Juros: " + Juros);
				}else {
					 System.out.println("Inválido");
				}
			}
		}
	}
	
	
	sc.close();

	}

}

/* Renda
 * De 0.00 a R$ 2000.00 / ISENTO
 * De R$ 2000.01 até R$ 3000.00 / 8%
 * De R$ 3000.01 até R$ 4500.00 / 18%
 * Acima de R$ 4500.00 / 28 %
 * 
 * essa tabela é a explicação do quanto se deve pagar de imposto de renda pelo quanto se
 * ganha.
 * 
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide
 * é de 8% apenas sobre R$ 1000.00, pois a faixa de 
   salário que fica de R$ 0.00 até R$ 2000.00 
   é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
   de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, 
   o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
   duas casas decimais
 * 
 * 
 * 
 */





