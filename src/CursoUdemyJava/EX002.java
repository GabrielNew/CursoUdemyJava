package CursoUdemyJava;

import java.util.Locale;
import java.util.Scanner;

public class EX002 {
	/*
	Programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
	casas decimais.
	
	Fórmula da área: area = π . raio 2
	Considere o valor de π = 3.14159
	
	*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o raio do círculo: ");
		double raio = ler.nextDouble();
		
		double area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A área do círculo é de %.4f %n", area);
		
		ler.close();
	}

}
