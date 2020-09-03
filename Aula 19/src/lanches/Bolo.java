package lanches;

public class Bolo extends Lanche {

	private String massa;
	private String recheio;
	private String cobertura;
	
	public Bolo(String massa, String recheio, String cobertura, Double preco) {
		super(preco);
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public String toString() {
		return "Bolo [massa=" + massa + ", recheio=" + recheio + ", cobertura=" + cobertura + "]";
	}

	@Override
	public Double tempo (Double distancia) {
		return 10 * distancia + 10;
	}

}
