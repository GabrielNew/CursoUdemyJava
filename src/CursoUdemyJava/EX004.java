package CursoUdemyJava;

import java.util.Scanner;

public class EX004 {
	
	/*
	 Programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	 hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
	 decimais. 
	*/

	public static void main(String[] args) {
		
		Scanner ler  = new Scanner(System.in);
		System.out.print("Número do Funcionário: ");
		int numfun = ler.nextInt();
		System.out.print("Total Horas Trabalhadas: ");
		int qtdhoras = ler.nextInt();
		System.out.print("Valor Hora: ");
		float precohora = ler.nextFloat();
		
		float salario = (qtdhoras * precohora);
		
		System.out.println("Número Funcionário: " + numfun);
		System.out.printf("Salário: R$%.2f %n", salario);
		
		ler.close();
	}

}
