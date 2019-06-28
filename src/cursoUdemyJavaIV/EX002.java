package cursoUdemyJavaIV;

import java.util.Scanner;

public class EX002 {
	/*
	 Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
	 Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
	 essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int qtd = ler.nextInt();
		int qtdout = 0;
		int qtdin = 0;
		
		for (int i=0;i<qtd; i++) {
			int num = ler.nextInt();
				
			if (num>=10 && num <=20){
				qtdin ++;
			} else {
				qtdout ++;
			}
		}
		
		System.out.println(qtdin+" in");
		System.out.println(qtdout+" out");
		
		ler.close();
	}

}
