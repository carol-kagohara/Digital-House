package voadores;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {
	
	private List <Voador> lista = new ArrayList<>();
	
	public TorreDeControle() {
		
	}
	
	public TorreDeControle(List<Voador> lista) {
		this.lista = lista;
	}

	public List<Voador> getLista() {
		return lista;
	}

	public void setLista(List<Voador> lista) {
		this.lista = lista;
	}
	
	public void voemTodos() {
		for(int i = 0; i < lista.size(); i++) {
			lista.get(i).voar();
		}
	}
	
	public void adicionarVoador(Voador umVoador) {
		lista.add(umVoador);
	}

}
