package cursoUdemyJavaIV;

import java.util.Scanner;

public class EX004 {
	/*
	 Criar um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
	 segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n = ler.nextInt();
		
		for (int i=0; i<n ;i++) {
			
			int num = ler.nextInt();
			int den = ler.nextInt();
			
			if(den == 0) {
				System.out.println("divisao impossivel");
			} else {
				double result = (double) num/den;
				System.out.printf("%.1f%n", result);
			}
		}
		ler.close();
	}

}
