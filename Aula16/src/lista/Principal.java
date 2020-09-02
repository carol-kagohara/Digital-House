package lista;

import java.util.ArrayList;
import java.util.List;

import produtos.Produtos;

public class Principal {

	public static void main(String[] args) {
		
		List<Produtos> lista = new ArrayList<>();
		
		Produtos prod = new Produtos("TV",900,10);
		lista.add(prod);
		
		lista.add(new Produtos("Microondas",900,10));
		lista.add(new Produtos("Geladeira",500,100));
		lista.add(new Produtos("Lapis",10,10));
		
//		lista.add(1);
//		lista.add(2);
//		lista.add(3);
//		lista.add(4);
//		lista.add(5);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNome());
		}
		
		lista.add(1, new Produtos("Garfo",1,1000));
		System.out.println("\n\n");
				
		for(Produtos p : lista) {
			System.out.println(p.getNome());
		}

		System.out.println("\n\n");
	}

}
