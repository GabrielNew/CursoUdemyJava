package cursoUdemyJavaIII;

import java.util.Scanner;

public class EX001 {
	/*
	 Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
	 incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
	 impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int senha = 0;
		
		while (true) {
			senha = ler.nextInt();
			
			if (senha != 2002) {
				System.out.println("Senha Inválida");
			} else {
				System.out.println("Acesso Permitido");
				break;
			}
		}
		
		ler.close();
	}

}
