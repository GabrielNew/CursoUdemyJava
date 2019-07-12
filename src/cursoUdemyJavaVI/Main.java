package cursoUdemyJavaVI;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		/* Inicio do Conta_Banco
		Conta_Banco conta1;
		
		System.out.print("Número da Conta: ");
		int num = ler.nextInt();
		ler.nextLine();
		System.out.print("Nome do Titular: ");
		String nome = ler.nextLine();
		System.out.print("Deseja efetuar um depósito agora? [S/N] ");
		String op = ler.nextLine();
		
		if (op.equals("s")) {
			System.out.print("Qual Valor? R$");
			double valor = ler.nextDouble();
			conta1 = new Conta_Banco(num, nome, valor);
		} else {
			conta1 = new Conta_Banco(num, nome);
		}
		
		System.out.println();
		System.out.println("Dados da Conta");
		System.out.println(conta1);
		
		System.out.println();
		System.out.print("Entre com um valor para depositar: R$");
		double valor = ler.nextDouble();
		conta1.depositar(valor);
		System.out.println("Conta Atualizada...");
		System.out.println(conta1);
		
		System.out.println();
		System.out.print("Entre com um valor para sacar: R$");
		valor = ler.nextDouble();
		conta1.sacar(valor);
		System.out.println("Conta Atualizada...");
		System.out.println(conta1);
		*/
		
		//Inicio do programa de Estudante
		Estudante[] quartos = new Estudante[10];
		
		System.out.print("Quantos quartos alugados? ");
		int qtd = ler.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			ler.nextLine();
			System.out.println("Rent"+(i+1)+":");
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.nextLine();
			System.out.print("Quarto: ");
			int quarto = ler.nextInt();
			quartos[quarto] = new Estudante(nome, email);
			System.out.println();
		}
		
		System.out.println("Quartos Ocupados...");
		
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ":" + quartos[i]);
			}
			
		}
		ler.close();
	}
}
