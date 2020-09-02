package banco;

public class Conta {
	
	private static final double TAXA = 5.00;
	
	private int numero;
	private String nome;
	private double resultado;
	
	public Conta(int numero, String nome, double resultado) {
		this.numero = numero;
		this.nome = nome;
		this.resultado = resultado;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void depositar(double montante) {
		this.resultado += montante;
	}
	
	public void sacar(double montante) {
		this.resultado = this.resultado - montante - this.TAXA;
	}

}
