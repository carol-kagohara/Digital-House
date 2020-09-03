package lanches;

public class Massa extends Lanche {
	
	private String molho;
	private TipoMassa tipo;
	
	public Massa(TipoMassa tipo, String molho, Double preco) {
		super(preco);
		this.molho = molho;
		this.tipo = tipo;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public TipoMassa getTipo() {
		return tipo;
	}

	public void setTipo(TipoMassa tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Massa [molho=" + molho + ", tipo=" + tipo + "]";
	}

	@Override
	public Double tempo (Double distancia) {
		return 10 * distancia + 30;
	}
	

}
