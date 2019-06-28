package cursoUdemyJavaIV;

import java.util.Scanner;

public class EX001 {
	/*
	 Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
	 X, se for o caso. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		
		for (int i = 1; i <= x; i+=2) {
			System.out.println(i);
		}
		
		ler.close();
	}

}
