package cursoUdemyJavaIV;

import java.util.Scanner;

public class EX006 {
	/*
	 Ler um número inteiro N e calcular todos os seus divisores.
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num = ler.nextInt();
		
		for (int i=1; i<=num; i++) {
			
			if (num%i == 0) {
				System.out.println(i);
			} 
			
		}
		
		ler.close();
	}

}
