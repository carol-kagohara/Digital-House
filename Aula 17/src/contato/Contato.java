package contato;

import java.util.List;
import java.util.Scanner;

public class Contato {
	
	private Integer id;
	private String nome;
	private Integer idade;
	private String telefone;
	private Endereco end;
	
	public Contato(Integer id, String nome, Integer idade, String telefone, Endereco end) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.end = end;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return ("id: " + this.id + "\nnome: " + this.nome + "\nidade: " + this.idade + "\ntelefone: " + this.telefone + 
				this.end);
	}

	public static void adicionarContato(Integer id, List <Contato> contatos) {
		Scanner sc = new Scanner(System.in);

		if (id >= 0) {
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Idade: ");
			Integer idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Telefone: ");
			String telefone = sc.nextLine();
			
			System.out.println("Digite seu endereço: ");
			System.out.println("Rua: ");
			String rua = sc.nextLine();
			
			System.out.println("Número: ");
			Integer numero = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Bairro: ");
			String bairro = sc.nextLine();
			
			System.out.println("Cidade: ");
			String cidade = sc.nextLine();
			
			System.out.println("Estado: ");
			String estado = sc.nextLine();
			
			Endereco end = new Endereco(rua, numero, bairro, cidade, estado);
			contatos.add(new Contato(id,nome,idade,telefone,end));
		}
	}
	
	public static void listarContatos(List <Contato> contatos) {
		
		for(int i = 0; i < contatos.size(); i++) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Contato " + (i+1) + ":");
			System.out.println(contatos.get(i).toString());
			System.out.println();
		}
	}
	
	public static void menu() {
		
		System.out.printf("\n**** Menu Principal *****\n");
		System.out.printf("[ 1 ] Incluir Contato\n"); //add
		System.out.printf("[ 2 ] Excluir Contato\n"); //remove
		System.out.printf("[ 3 ] Listar Contatos\n"); //for
		System.out.printf("[ 4 ] Pesquisar Contato\n"); //for
		System.out.printf("[ 0 ] Encerrar o Programa\n");
		System.out.printf("\nOpção Desejada: ");
	}

	public static void deletarContato (Integer id, List <Contato> contatos) {
		int j = 0;
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getId() == id) {
				contatos.remove(contatos.get(i));
				j = 1;
			}
		}
		if (j == 0) {
			System.out.println("Contato não encontrado");
		}
	}
	
	public static void buscarContato(Integer id, List <Contato> contatos) {
		int k = 0;
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getId() == id) {
				System.out.println(contatos.get(i).toString());
				k = 1;
			}
		}
		if (k == 0) {
			System.out.println("Contato não encontrado");
		}
	}
}
