package CursoUdemyJava;

import java.util.Scanner;

public class EX005 {
	/*
	 Programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
	 código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o código da Peça 1: ");
		int id1 = ler.nextInt(); 
		System.out.print("Quantidade da Peça 1: ");
		int num1 = ler.nextInt();
		System.out.print("Valor da Peça 1: ");
		float preco1 = ler.nextFloat();
		
		System.out.print("Digite o código da Peça 2: ");
		int id2 = ler.nextInt(); 
		System.out.print("Quantidade da Peça 2: ");
		int num2 = ler.nextInt();
		System.out.print("Valor da Peça 2: ");
		float preco2 = ler.nextFloat();
		
		double preco_total = (num1 * preco1) + (num2 * preco2);
		System.out.printf("Valor a pagar: R$%.2f %n", preco_total);

		ler.close();
	}

}
