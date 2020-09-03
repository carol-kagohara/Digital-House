package santander;

public class ContaCorrente extends Conta {
	
	private Double limiteChequeEspecial;
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(Double limiteChequeEspecial) {
		super();
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	@Override
	public void sacar(double valor) {
		if (valor > getSaldo() + limiteChequeEspecial) {
			System.out.println("Você superou o limite do seu saldo e do cheque especial.");
		} else {
			super.sacar(valor);
			if (getSaldo() - valor < 0) {
				limiteChequeEspecial = limiteChequeEspecial - (valor - getSaldo());
			}
		}
	}
	
	public void depositarCheque(Cheque cheque) {
		depositar(cheque.getValor());
	}

	@Override
	public String toString() {
		return "ContaCorrente [limiteChequeEspecial=" + limiteChequeEspecial + "]";
	}

}
