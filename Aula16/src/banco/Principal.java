package banco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.println("Digite o nome do cliente: ");
		String nome = sc.next();
		System.out.println("Deseja fazer um depósito inicial (s/n)?");
		sc.nextLine(); // para que ele nao pegue o enter
		char depositoInicial = sc.next().toUpperCase().charAt(0);
		double valor;
		if (depositoInicial == 's') {
			System.out.println("Digite o valor do depósito inicial: ");
			valor = sc.nextDouble();
		} else {
			valor = 0;
		}
		
		Conta cont = new Conta(numero, nome, valor);
		
		System.out.println("Informações da conta: ");
		System.out.println("Número: " + cont.getNumero() + ", Nome: " + cont.getNome() + ", Saldo na conta: " + cont.getResultado());
		
		System.out.println();
		System.out.println();
		System.out.println("Digite o valor do depósito: ");
		double deposito = sc.nextDouble();
		cont.depositar(deposito);
		System.out.println("Informações Atualizadas: ");
		System.out.println("Número: " + cont.getNumero() + ", Nome: " + cont.getNome() + ", Saldo na conta: " + cont.getResultado());
		
		System.out.println();
		System.out.println();
		System.out.println("Digite o valor do saque: ");
		double saque = sc.nextDouble();
		cont.sacar(saque);
		System.out.println("Informações Atualizadas: ");
		System.out.println("Número: " + cont.getNumero() + ", Nome: " + cont.getNome() + ", Saldo na conta: " + cont.getResultado());
		
		sc.close();
	}

}
