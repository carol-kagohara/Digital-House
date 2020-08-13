package Estoque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto prod = new Produto();
		
		System.out.println("Coloque os dados do produto: ");
		
		System.out.println("Nome: ");
		prod.nome = sc.next();
		System.out.println("Preço: ");
		prod.preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		prod.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: " + prod.nome + ", R$ " + prod.preco + ", " + prod.quantidade + " unidades, Total: R$ " + prod.valorTotal());

		System.out.println("Coloque a quantidade adicionada no estoque: ");
		int quantidade = sc.nextInt();
		prod.adicionar(quantidade);
		System.out.println("Dados do produto: " + prod.nome + ", R$ " + prod.preco + ", " + prod.quantidade + " unidades, Total: R$ " + prod.valorTotal());
		
		System.out.println("Coloque a quantidade retirada do estoque: ");
		int ret = sc.nextInt();
		prod.remover(ret);
		System.out.println("Dados do produto: " + prod.nome + ", R$ " + prod.preco + ", " + prod.quantidade + " unidades, Total: R$ " + prod.valorTotal());
		
		sc.close();
		
	}

}
