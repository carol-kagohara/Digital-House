package banco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Digite o nome do cliente: ");
		String nome = sc.next();
		System.out.println("Deseja fazer um dep�sito inicial (s/n)?");
		sc.nextLine(); // para que ele nao pegue o enter
		char depositoInicial = sc.next().toUpperCase().charAt(0);
		double valor;
		if (depositoInicial == 's') {
			System.out.println("Digite o valor do dep�sito inicial: ");
			valor = sc.nextDouble();
		} else {
			valor = 0;
		}
		
		Conta cont = new Conta(numero, nome, valor);
		
		System.out.println("Informa��es da conta: ");
		System.out.println("N�mero: " + cont.getNumero() + ", Nome: " + cont.getNome() + ", Saldo na conta: " + cont.getResultado());
		
		System.out.println();
		System.out.println();
		System.out.println("Digite o valor do dep�sito: ");
		double deposito = sc.nextDouble();
		cont.depositar(deposito);
		System.out.println("Informa��es Atualizadas: ");
		System.out.println("N�mero: " + cont.getNumero() + ", Nome: " + cont.getNome() + ", Saldo na conta: " + cont.getResultado());
		
		System.out.println();
		System.out.println();
		System.out.println("Digite o valor do saque: ");
		double saque = sc.nextDouble();
		cont.sacar(saque);
		System.out.println("Informa��es Atualizadas: ");
		System.out.println("N�mero: " + cont.getNumero() + ", Nome: " + cont.getNome() + ", Saldo na conta: " + cont.getResultado());
		
		sc.close();
	}

}
