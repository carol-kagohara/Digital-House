package principal;

import produtos.Produtos;

public class Principal {

	public static void main(String[] args) {
		
		Produtos tv = new Produtos("TV",900,10);
		Produtos microondas = new Produtos("Microondas",200,100);
		
		System.out.println(tv.getNome());
		tv.setNome("Televis�o");
		System.out.println(tv.getNome());

	}

}
