/*Fazer um programa que leia o número de um funcionário,
 *Seu número de horas trabalhadas, o valor que recebe por 
  hora e calcula o salário desse funcionário. 
  A seguir, mostre o número e o salário do funcionário, com duas casas 
  decimais
 */

package Main;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int idFuncionario;
  int horasTrabalhadas;
  int valorporhoratrab;
  
  System.out.print("numero funcionario: ");
  idFuncionario = sc.nextInt();
  
  System.out.print("Horas Trabalhadas: ");
  horasTrabalhadas = sc.nextInt();
  
  System.out.print("Valor por Hora Trabalhada: ");
  valorporhoratrab = sc.nextInt();
  
  
  double Salario = horasTrabalhadas * valorporhoratrab;
  
  System.out.print("Id Funcionario : " + idFuncionario 
		  + " Salario : " + Salario + "$");
 
  sc.close();
  
	}

}
