package impressora;

public class Contrato implements Imprimivel {
	
	private String nome;
	private String tipo;

	public Contrato(String nome) {
		this.nome = nome;
		this.tipo = "contrato";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void imprimir() {
		System.out.println("Sou um contrato muito legal");
		
	}

}
