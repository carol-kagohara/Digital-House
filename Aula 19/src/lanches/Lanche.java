package lanches;

public abstract class Lanche {
	
	private Double preco;
	
	public Lanche() {
		
	}

	public Lanche(Double preco) {
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Lanche [preco=" + preco + "]";
	}
	
	public Double tempo (Double distancia) {
		return 10 * distancia;
	}

}
