package CursoUdemyJava;

import java.util.Scanner;

public class EX001 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		float n1, n2, soma = 0;
		
		System.out.print("Por favor, digite um número: ");
		n1 = leitor.nextFloat();
		System.out.print("Digite outro número: ");
		n2 = leitor.nextFloat();
		
		soma = n1 + n2;
		
		System.out.println("Soma = " + soma);
		
		leitor.close();
		
	}

}
