package Estoque;

public class Produto {
	String nome;
	double preco;
	int quantidade;
	
	public double valorTotal() {
		double valor = preco*quantidade;
		return valor;
	}
	
	public void adicionar(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}
	
	public void remover(int num) {
		quantidade = quantidade - num;
	}
}

