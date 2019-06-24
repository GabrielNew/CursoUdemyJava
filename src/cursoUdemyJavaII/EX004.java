package cursoUdemyJavaII;

import java.util.Scanner;

public class EX004 {
	/*
	 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
	 começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int inicio = ler.nextInt();
		int fim = ler.nextInt();
		int tot = 0;
		
		if (inicio >= fim) {
			tot = (24 - inicio) + fim;
		} else {
			tot = (inicio - fim) * -1;
		}
		
		System.out.println("O JOGO DUROU " + tot + " HORA(S)");
		
		ler.close();
	}

}
