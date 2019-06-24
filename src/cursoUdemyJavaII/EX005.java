package cursoUdemyJavaII;

import java.util.Scanner;

public class EX005 {
	/*
	 Escreva um programa que leia o código de um item e a quantidade deste item. A
	 seguir, calcule e mostre o valor da conta a pagar. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int id = ler.nextInt();
		int qtd = ler.nextInt();
		double preco = 0.0;
		
		switch (id) {
		case 1:
			preco = qtd *  4;
			break;
		case 2:
			preco = qtd *  4.50;
			break;
		case 3:
			preco = qtd * 5;
			break;
		case 4:
			preco = qtd * 2;
			break;
		case 5:
			preco = qtd * 1.50;
			break;
		default:
			break;
		}
		
		System.out.printf("Total: R$ %.2f %n", preco);
		ler.close();
	}

}
