package CursoUdemyJava;

import java.util.Scanner;

public class EX006 {
	/*
	 Programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
	 mostre:
	 a) a área do triângulo retângulo que tem A por base e C por altura.
	 b) a área do círculo de raio C. (pi = 3.14159)
	 c) a área do trapézio que tem A e B por bases e C por altura.
	 d) a área do quadrado que tem lado B.
	 e) a área do retângulo que tem lados A e B. 
	*/
	
	public static void main(String[] args) {
		double pi = 3.14159;
		
		Scanner ler = new Scanner(System.in);
		double a = ler.nextDouble();
		double b = ler.nextDouble();
		double c = ler.nextDouble();
		
		double areaTriangulo = (a*c)/2;
		double areaCirculo = pi * Math.pow(c, 2.0);
		double areaTrapezio = ((a+b)/2.0) * c;
		double areaQuadrado = Math.pow(b, 2.0);
		double areaRetangulo = a*b;
		
		System.out.printf("Triangulo: %.3f %n",areaTriangulo);
		System.out.printf("Circulo: %.3f %n", areaCirculo);
		System.out.printf("Trapezio: %.3f %n", areaTrapezio);
		System.out.printf("Quadrado: %.3f %n", areaQuadrado);
		System.out.printf("Retangulo: %.3f %n", areaRetangulo);
		
		ler.close();
	}

}
