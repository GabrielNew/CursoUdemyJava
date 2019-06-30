package cursoUdemyJavaV;

public class ConversorMoeda {
	
	public static double conversor(double valor_Dolar, double qtd_Dolares) {
		double total_Dolares = (qtd_Dolares * valor_Dolar);
		double total_IOF = total_Dolares * 0.06;
		return total_Dolares + total_IOF;
	}
	
}
