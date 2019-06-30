package cursoUdemyJavaV;

public class Funcionario {
	
	String Nome;
	double Salario_Bruto;
	double Imposto;
	
	public double SalarioLiquido() {
		return Salario_Bruto - Imposto;
	}
	
	public void AumentaSalario(double porcentagem) {
		double Salarioliquido = SalarioLiquido() + (Salario_Bruto * (porcentagem/100));
		System.out.println("Dados Atualizados: " + Nome + ", $" + Salarioliquido);
	}
	
}
