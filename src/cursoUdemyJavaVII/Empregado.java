package cursoUdemyJavaVII;

public class Empregado {
	private int id;
	private double sal;
	private String nome;
	
	
	public Empregado(int id, double sal, String nome) {
		this.id = id;
		this.sal = sal;
		this.nome = nome;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSal() {
		return this.sal;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + sal;
	}
	
	public void updateSal(double percent) {
		double nsal = (this.getSal()+(this.getSal()*(percent/100.0)));
		this.setSal(nsal);
	}
	
}
