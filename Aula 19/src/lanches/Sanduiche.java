package lanches;

import java.util.List;

public class Sanduiche extends Lanche{
	
	private List <String> ingredientes;

	public Sanduiche(List <String> ingredientes, Double preco) {
		super(preco);
		this.ingredientes = ingredientes;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Sanduiche [ingredientes=" + ingredientes + "]";
	}
	
	@Override
	public Double tempo (Double distancia) {
		return 10 * distancia + 15;
	}

}
