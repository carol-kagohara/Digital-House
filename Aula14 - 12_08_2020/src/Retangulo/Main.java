package Retangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Digite as medidas do tri�ngulo: ");
		System.out.println("Comprimento: ");
		ret.comprimento = sc.nextDouble();
		System.out.println("Altura: ");
		ret.altura = sc.nextDouble();
		
		System.out.println("AREA = " + ret.area());
		System.out.println("PER�METRO = " + ret.perimetro());
		System.out.println("DIAGONAL = " + ret.diagonal());		
		
		sc.close();
	}

}
