package cursoUdemyJavaVII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		List<Empregado> emp = new ArrayList<>();
		
		System.out.println("Quantos funcionários você deseja cadastrar? ");
		int n = ler.nextInt();
		int i = 1;
		while (n > 0) {
			System.out.println("Empregado " + "#" + i);
			System.out.print("ID: ");
			int id = ler.nextInt();
			System.out.print("Nome: ");
			String nome = ler.next();
			System.out.print("Salário: ");
			double sal = ler.nextDouble();
			emp.add(new Empregado(id, sal, nome));
			n--;
			i++;
			System.out.println(" ");
		}
		
		System.out.println("Digite o ID do funcionário que você deseja aumentar o salário: ");
		int sid = ler.nextInt();
		
		for (Empregado empregado : emp) {
			if(empregado.getId() == sid) {
				System.out.println("Em quantos % você deseja aumentar o salário desse funcionário? ");
				double percent = ler.nextDouble();
				empregado.updateSal(percent);
			}
		}
		
		System.out.println("Lista dos Empregados:");
		for (Empregado empregado : emp) {
			System.out.println(empregado);
		}
		
		ler.close();
	}

}
