package cursoUdemyJavaIV;

import java.util.Scanner;

public class EX005 {
	/*
	 Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
	 Lembrando que, por definição, fatorial de 0 é 1. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		int fat = 1;
		
		for (int i=0; n>i; n--) {
			fat *= n;
		}
		
		System.out.println(fat);
		
		ler.close();
	}

}
