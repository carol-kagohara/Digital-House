package Salario;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Nome: ");
		func.nome = sc.nextLine();
		System.out.println("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + func.nome + ", R$ " + func.salarioLiquido());
		System.out.println();
		
		System.out.println("Com qual porcentagem deseja aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		func.aumentarSalario(porcentagem);
		
		System.out.println("Funcionário: " + func.nome + ", R$ " + func.salarioLiquido());

		sc.close();
	}

}
