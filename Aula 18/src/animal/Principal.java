package animal;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Mamifero m1 = new Mamifero();
		Passaro p1 = new Passaro();
		
		Animal a2 = new Animal();
		Animal a3 = new Mamifero();
		Animal a4 = new Passaro();
		Cachorro c = new Cachorro();
		
		c.falar();
		
		List <Animal> lista = new ArrayList<>();
		
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		for(Animal a : lista) {
			if(a instanceof Mamifero) {
				System.out.println("Mamífero");
			}
			if(a instanceof Passaro) {
				System.out.println("Pássaro");
			}
			if(a instanceof Animal) {
				System.out.println("Animal");
			}			
			
		}

	}

}
