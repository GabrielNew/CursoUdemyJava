package cursoUdemyJavaII;

import java.util.Scanner;

public class EX003 {
	/*
	 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	 Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
	 ordem crescente ou decrescente. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.print("Sao Multiplos");
		} else {
			System.out.print("Nao Sao Multiplos");
		}
		
		ler.close();
	}

}
