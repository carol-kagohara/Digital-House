package impressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {
	
	private List <Imprimivel> lista = new ArrayList<>();
	
	public Impressora() {
		
	}
	
	public Impressora(List<Imprimivel> lista) {
		this.lista = lista;
	}

	public List<Imprimivel> getLista() {
		return lista;
	}

	public void setLista(List<Imprimivel> lista) {
		this.lista = lista;
	}

	public void imprimirTudo() {
		for(int i = 0; i < lista.size(); i++) {
			lista.get(i).imprimir();
		}
	}
	
	public void adicionarImprimivel(Imprimivel umImprimivel) {
		lista.add(umImprimivel);
	}

}
