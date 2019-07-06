package cursoUdemyJavaVI;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
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
		
		ler.close();
	}

}
