package santander;

public class ContaPoupanca extends Conta {
	
	private Double taxaJuros;
	
	public ContaPoupanca() {
		
	}

	public ContaPoupanca(Double taxaJuros) {
		super();
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public void sacar(double valor) {
		if (valor > getSaldo()) {
			System.out.println("Você ultrapassou o limite do seu saldo.");
		}
		else {
			super.sacar(valor);
		}
	}
	
	public void recolherJuros() {
		super.depositar(getSaldo() * taxaJuros);
	}

	@Override
	public String toString() {
		return "ContaPoupanca [taxaJuros=" + taxaJuros + "Saldo " + getSaldo() + "]";
	}
	
}
