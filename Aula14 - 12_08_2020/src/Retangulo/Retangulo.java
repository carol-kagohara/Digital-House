package Retangulo;

public class Retangulo {
	double comprimento;
	double altura;
	
	public double area() {
		double area = this.comprimento * this.altura;
		return area;
	}
	
	public double perimetro() {
		double perimetro = 2*this.comprimento + 2*this.altura;
		return perimetro;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt(Math.pow(this.comprimento, 2) + Math.pow(this.altura, 2));
		return diagonal;
	}
}
