package geometria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um raio: ");
		double raio = sc.nextDouble();
		
		System.out.printf("Circunferência: %.2f \nVolume: %.2f \nPi: %.2f", Raio.circunferencia(raio), Raio.volume(raio), Raio.pi);
		
		sc.close();


	}

}
