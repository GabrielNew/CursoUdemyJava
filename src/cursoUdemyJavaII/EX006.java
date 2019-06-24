package cursoUdemyJavaII;

import java.util.Scanner;

public class EX006 {
	/*
	 Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
	 seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
	 nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double ponto = ler.nextFloat();
		
		if (ponto < 0.0 || ponto > 100.0) {
			System.out.println("Fora do Intervalo");
		} else if (ponto <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (ponto <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (ponto <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75, 100]");
		}
		
		ler.close();
	}

}
