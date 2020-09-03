package impressora;

public class Foto implements Imprimivel {
	
	private String nome;
	private String tipo;

	public Foto(String nome) {
		this.nome = nome;
		this.tipo = "foto";
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
		System.out.println("Sou uma selfie");
		
	}

}
