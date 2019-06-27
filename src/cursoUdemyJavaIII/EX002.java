package cursoUdemyJavaIII;

import java.util.Scanner;

public class EX002 {
	/*
	 Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
	 cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
	 menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		while(true){
			int x = ler.nextInt();
			int y = ler.nextInt();
			
			if (x>0 && y>0){
				System.out.println("primeiro");
			} else if (x>0 && y<0){
				System.out.println("quarto");
			} else if(x<0 && y>0){
				System.out.println("segundo");
			} else if(x<0 && y<0){
				System.out.println("terceiro");
			} else if(x==0 || y==0) {
				break;
			}
		}
		
		ler.close();
	}

}
