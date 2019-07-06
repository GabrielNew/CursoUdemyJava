package cursoUdemyJavaVI;

public class Conta_Banco {
	private int num_conta;
	private String nome_titular;
	private double saldo;
	
	public Conta_Banco() {
	}
	
	public Conta_Banco(int num_conta, String nome_titular, double valorInicial) {
		this.num_conta = num_conta;
		this.nome_titular = nome_titular;
		depositar(valorInicial);
	}
	
	public Conta_Banco(int num_conta, String nome_titular) {
		this.num_conta = num_conta;
		this.nome_titular = nome_titular;
		this.saldo = 0;
	}
	
	public int getNum_conta() {
		return num_conta;
	}
	
	public String getNometitular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor + 5;
	}

	@Override
	public String toString() {
		return "conta=" 
			   + num_conta 
			   + ", titular=" 
			   + nome_titular 
			   + ", saldo=" 
			   + saldo;
	}
}
