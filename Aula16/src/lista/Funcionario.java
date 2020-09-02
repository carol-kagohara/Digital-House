package lista;

import java.util.List;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario (Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Double getSalario() {
		return this.salario;
	}
	
	public String toString() {
		return ("ID: " + this.id + "\nNome: " + this.nome + "\nSalário: " + this.salario);
	}
	
	public static Integer verificarId(Integer id, List <Funcionario> lista) {
		Integer controle = 0;
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				controle = 1;
				break;
			}
		}
		return controle;
	}
	
	public void aumentarSalario(Integer id, double taxa) {
		this.salario = this.salario * (1+taxa);
	}

	public static void listar(List <Funcionario> lista) {
		for (int k = 0; k < lista.size(); k++) {
			System.out.println(lista.get(k).toString());
		}
	}
}
