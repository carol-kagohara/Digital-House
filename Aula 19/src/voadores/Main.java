package voadores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TorreDeControle torre = new TorreDeControle();
		
		Integer energia;
		
		System.out.println("Energia inicial do pato: ");
		energia = sc.nextInt();
		Pato pato = new Pato(energia);
		torre.adicionarVoador(pato);
		
		Aviao aviao = new Aviao();
		torre.adicionarVoador(aviao);
		
		SuperHomem superHomem = new SuperHomem();
		torre.adicionarVoador(superHomem);
		
		torre.voemTodos();

	}

}
