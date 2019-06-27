package cursoUdemyJavaIII;

import java.util.Scanner;

public class EX003 {
	/*
	 Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
	 um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
	 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
	 que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
	 mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int tot_alcool = 0;
		int tot_gaso = 0;
		int tot_diesel = 0;
		int op;
		
		while(true){
			op = ler.nextInt();
			if (op==1) {
				tot_alcool++;
			} else if (op==2){
				tot_gaso++;
			} else if (op==3) {
				tot_diesel++;
			} else if(op==4) {
				System.out.println("MUITO OBRIGADO!");
				break;
			} 
		}
		
		System.out.println("Alcool: " + tot_alcool);
		System.out.println("Gasolina: "+ tot_gaso);
		System.out.println("Diesel: "+ tot_diesel);
		ler.close();
	}

}
