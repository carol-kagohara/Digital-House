package lanches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <String> ingredientes = new ArrayList<>();
		menu();
		Double distancia;
		int tipo, opcao = sc.nextInt();
		String molho, massa, recheio, cobertura;
		
		switch (opcao) {
		case 1:
			System.out.println("Escolha 10 ingredientes para o seu sanduiche: ");
			for (int i = 0; i < 10; i++) {
				String ing = sc.next();
				ingredientes.add(ing);
			}
			Sanduiche sand = new Sanduiche(ingredientes, 10.0);
			System.out.println("Qual a distâcia até sua casa?");
			distancia = sc.nextDouble();
			System.out.println("Seu lanche: " + sand);
			System.out.println("Valor: " + sand.getPreco());
			System.out.println("Tempo: " + sand.tempo(distancia) + " minutos");
			break;
			
		case 2:
			System.out.println("Escolha sua massa: ");
			TipoMassa vetor[] = TipoMassa.values();
			for (int i = 0; i < vetor.length; i++) {
				System.out.println(i + " - " + vetor[i]);
			}
			tipo = sc.nextInt();
			sc.nextLine();
			System.out.println("Escolha seu molho: ");
			molho = sc.nextLine();
			Massa mas = new Massa(vetor[tipo], molho, 15.0);
			System.out.println("Qual a distâcia até sua casa?");
			distancia = sc.nextDouble();
			System.out.println("Seu lanche: " + mas);
			System.out.println("Valor: " + mas.getPreco());
			System.out.println("Tempo: " + mas.tempo(distancia) + " minutos");
			break;
			
		case 3:
			System.out.println("Escolha sua massa: ");
			massa = sc.nextLine();
			sc.nextLine();
			System.out.println("Escolha seu recheio: ");
			recheio = sc.nextLine();
			System.out.println("Escolha sua cobertura: ");
			cobertura = sc.nextLine();
			Bolo bolo = new Bolo (massa, recheio, cobertura, 12.0);
			System.out.println("Qual a distâcia até sua casa?");
			distancia = sc.nextDouble();
			System.out.println("Seu lanche: " + bolo);
			System.out.println("Valor: " + bolo.getPreco());
			System.out.println("Tempo: " + bolo.tempo(distancia) + " minutos");
			break;
			
		}
	}
	
	public static void menu() {
		System.out.println("MENU: ");
		System.out.println("1 - Sanduiches");
		System.out.println("2 - Massas");
		System.out.println("3 - Bolos");
	}

}
