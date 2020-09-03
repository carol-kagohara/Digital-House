package santander;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Integer id, busca = 0;
		Double limite, taxa, valor;
		String sobrenome, rg, cpf, op;
		Conta conta;
		Scanner sc = new Scanner(System.in);
		List <Cliente> lista = new ArrayList<>();
		
		int opcao = 0;
		
		do {
			menu ();
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("ID do cliente: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Sobrenome: ");
				sobrenome = sc.nextLine();
				System.out.println("RG: ");
				rg = sc.nextLine();
				System.out.println("CPF: ");
				cpf = sc.nextLine();
				System.out.println("Conta Corrente ou Conta Poupança? (c/p)");
				op = sc.nextLine();
				if (op.equals("c")) {
					System.out.println("Limite do cheque especial: ");
					limite = sc.nextDouble();
					conta = new ContaCorrente(limite);
				} else {
					System.out.println("Taxa de Juros: ");
					taxa = sc.nextDouble();
					conta = new ContaPoupanca(taxa);
				}
				lista.add(new Cliente(id,sobrenome,rg,cpf,conta));
				System.out.println(lista);
				break;
			case 2:
				System.out.println("Digite o ID do cliente: ");
				id = sc.nextInt();
				for (int i = 0; i < lista.size(); i++) {
					if(id == lista.get(i).getId()) {
						System.out.println("Digite o valor que deseja depositar: ");
						valor = sc.nextDouble();
						lista.get(i).getConta().depositar(valor);
						busca = 1;
						System.out.println("Saldo atual: " + lista.get(i).getConta().getSaldo());
					}
				}
				if (busca == 0) {
					System.out.println("ID não encontrado");
				}
				System.out.println(lista);
				break;
			case 3: 
				System.out.println("Digite o ID do cliente: ");
				id = sc.nextInt();
				for (int i = 0; i < lista.size(); i++) {
					if(id == lista.get(i).getId()) {
						System.out.println("Digite o valor que deseja sacar: ");
						valor = sc.nextDouble();
						lista.get(i).getConta().sacar(valor);
						busca = 1;
						System.out.println("Saldo atual: " + lista.get(i).getConta().getSaldo());
					}
				}
				if (busca == 0) {
					System.out.println("ID não encontrado");
				}
				System.out.println(lista);
				break;
			case 4: break;
			}
	
		} while (opcao < 4);

		sc.close();
	}

	public static void menu() {
		System.out.println("MENU: ");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Fazer um depósito");
		System.out.println("3 - Fazer um saque");
		System.out.println("4 - Sair");
	}
	
}