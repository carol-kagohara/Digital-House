package Notas;

public class Aluno {
	
	String nome;
	double nota1;
	double nota2;
	double nota3;
	
	public double notaFinal() {
		double notaFinal = this.nota1 + this.nota2 + this.nota3;
		return notaFinal;
	}
}
