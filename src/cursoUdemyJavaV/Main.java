package cursoUdemyJavaV;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		// Início do programa da classe Retangulo
		Retangulo ret = new Retangulo();
		System.out.println("Digite o valor da altura e da largura do retângulo");
		ret.altura = ler.nextDouble();
		ret.largura = ler.nextDouble();
		
		System.out.println("Área = " + ret.Area());
		System.out.println("Perímetro = " + ret.Perimetro());
		System.out.println("Diagonal = " + ret.Diagonal());
		// Término do Programa
		System.out.println();
		ler.nextLine();
		// Início do programa da classe Funcionario
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.Nome = ler.nextLine();
		System.out.print("Salário Bruto: ");
		func.Salario_Bruto = ler.nextDouble();
		System.out.print("Imposto: ");
		func.Imposto = ler.nextDouble();
		
		System.out.println("Funcionário: " + func.Nome + ", $" + func.SalarioLiquido());
		
		System.out.print("Em qual porcentagem deseja aumentar o salário? ");
		double porcentagem = ler.nextDouble();
		func.AumentaSalario(porcentagem);
		// Término do programa
		System.out.println();
		ler.nextLine();
		// Inicio do Programa da classe Estudante
		Estudante estudante = new Estudante();
		System.out.print("Nome do Estudante: ");
		estudante.Nome = ler.nextLine();
		System.out.println("Suas três notas: ");
		estudante.nota1 = ler.nextFloat();
		estudante.nota2 = ler.nextFloat();
		estudante.nota3 = ler.nextFloat();
		
		estudante.Situacao();
		// Término do Programa
		
		System.out.print("Qual é a cotação atual do dólar? R$");
		double cotacao = ler.nextDouble();
		System.out.print("Quantos dólares você deseja comprar? ");
		double qtd_Dolar = ler.nextDouble();
		System.out.printf("O valor da compra em reais é: R$ %.2f ", ConversorMoeda.conversor(cotacao, qtd_Dolar));
		
		ler.close();
	}

}