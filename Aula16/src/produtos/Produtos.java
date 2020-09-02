package produtos;

public class Produtos {
	
	private String nome;
	private double preco;
	private int quantidade;

	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produtos() {
		
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double 
	totalValorEstoque() {
		return this.preco * this.quantidade;
	}

	public void adicionarProdutos(int quant) {
		this.quantidade += quant;
		printData();
	}

	public void removerProdutos(int quant) {
		this.quantidade -= quant;
		printData();
	}

	public void printData() {
		System.out.println(String.format("Updated data: %s, $ %s, %s units, Total: $ %s\n", getNome(), getPreco(),
				getQuantidade(), totalValorEstoque()));
	}
}
