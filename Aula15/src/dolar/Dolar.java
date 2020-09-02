package dolar;

import java.util.Locale;
import java.util.Scanner;

public class Dolar {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do dólar?");
		double dolar = sc.nextDouble();
		
		System.out.println("Quantos dólares você quer comprar?");
		double quant = sc.nextDouble();
		
		System.out.printf("Valor a ser pago: %.2f", Dolar.converter(dolar, quant));
		
		sc.close();

	}
	
	public static final double IOF = 0.06;
	
	public static double converter(double dolar, double quant) {
		return dolar * quant * (1 + Dolar.IOF);		
	}

}
