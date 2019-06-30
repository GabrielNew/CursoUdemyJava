package cursoUdemyJavaV;

public class Estudante {
	String Nome;
	float nota1, nota2, nota3;
	
	public float MediaFinal(float nota1, float nota2, float nota3) {
		return nota1 + nota2 + nota3;
	}
	
	public void Situacao() {
		float media = MediaFinal(this.nota1, this.nota2, this.nota3);
		System.out.println("Nota Final: " + media);
		
		if (media >= 60.00) {
			System.out.println("Aprovado");
		} else {
			float falta = 60 - media;
			System.out.println("Reprovado");
			System.out.println("Ainda falta(m), " + falta + " Pontos");
		}
	}
	
}
