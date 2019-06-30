package cursoUdemyJavaV;

public class Retangulo {
	
	double altura;
	double largura;
	
	public double Area() {
		return altura * largura;
	}
	
	public double Perimetro() {
		return (2*altura) + (2*largura);
	}
	
	public double Diagonal() {
		return Math.sqrt((altura*altura) + (largura*largura));
	}
}
