package Salario;

public class Funcionario {
	String nome;
	double salarioBruto;
	double imposto;
	
	public double salarioLiquido() {
		double salario = salarioBruto - imposto;
		return salario;
	}
	
	public void aumentarSalario(double porcentagem) {
		porcentagem = porcentagem/100;
		this.salarioBruto = this.salarioBruto*(1 + porcentagem);
	}
}
