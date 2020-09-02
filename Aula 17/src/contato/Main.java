package contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <Contato> contatos = new ArrayList<>();
		
		Integer id = 0;
		
		while (id >= 0) {
			
			System.out.println("Preencha seus dados: ");
			System.out.println("ID: ");
			id = sc.nextInt();
			Contato.adicionarContato(id,contatos);
			
		}
		
		Contato.listarContatos(contatos);
		
		Integer opcao = 5;
		
		do {
			Contato.menu();
			
			opcao = sc.nextInt();
		
			switch(opcao) {
			case 1: System.out.println("Preencha seus dados: ");
					System.out.println("ID: ");
					id = sc.nextInt();
					Contato.adicionarContato(id, contatos);
					break;
				
			case 2: System.out.println("Digite o ID do contato que deseja deletar: ");
					id = sc.nextInt();
					Contato.deletarContato(id, contatos);
					break;
					
			case 3: Contato.listarContatos(contatos);
					break;
			
			case 4: System.out.println("Digite o ID do contato que deseja consultar: ");
					id = sc.nextInt();
					Contato.buscarContato(id, contatos);
					break;
				
			case 0: opcao = 0; 
					break;
				
			default: System.out.println("Escolha uma opção válida: ");
					opcao = 5;
			
			}			
		} while (opcao != 0);
		
	}

}
