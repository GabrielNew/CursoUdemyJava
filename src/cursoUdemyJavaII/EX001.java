package cursoUdemyJavaII;

import java.util.Scanner;

public class EX001 {
	/*
	 Programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		int num = ler.nextInt();
		
		if (num>=0){
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		ler.close();
	}

}
