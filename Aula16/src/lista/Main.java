package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList<>();
		
		System.out.println("Digite o n�mero de funcion�rios: ");
		int n = sc.nextInt();
		
		Integer controle = 0, id = 0;
		
		System.out.println("ID: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Sal�rio: ");
		Double salario = sc.nextDouble();
		
		lista.add(new Funcionario(id,nome,salario));
		
		for(int i = 1; i < n; i++) {
			controle = 0;
			while (controle == 0) {
				System.out.println("ID: ");
				id = sc.nextInt();
				
				for (int j = 0; j < lista.size(); j++) {
					if(lista.get(j).getId() != id) {
						controle = 1;
					} else {
						System.out.println("ID j� existe!");
						controle = 0;
						break;
					}
				}
			}

			sc.nextLine();
			System.out.println("Nome: ");
			nome = sc.nextLine();
			
			System.out.println("Sal�rio: ");
			salario = sc.nextDouble();
			
			Funcionario func = new Funcionario(id,nome,salario);
			lista.add(func);
		}
		
		Funcionario.listar(lista);
		
		System.out.println("Digite o ID do funcion�rio que deseja aumentar o sal�rio: ");
		Integer idBusca = sc.nextInt();
		
		if (Funcionario.verificarId(idBusca, lista) == 0) {
			System.out.println("ID n�o encontrado");
		} else {
			System.out.println("Digite a taxa de aumento: ");
			double taxa = sc.nextDouble();
			for (int j = 0; j < lista.size(); j++) {
				if(lista.get(j).getId() == idBusca){
					lista.get(j).aumentarSalario(idBusca, taxa);
				}
			}
		}
		
		Funcionario.listar(lista);
	}
}
