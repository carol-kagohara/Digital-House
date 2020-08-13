package Notas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno al = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		al.nome = sc.nextLine();
		System.out.println("Nota 1º trimestre: ");
		al.nota1 = sc.nextDouble();
		System.out.println("Nota 2º trimestre: ");
		al.nota2 = sc.nextDouble();
		System.out.println("Nota 3º trimestre: ");
		al.nota3 = sc.nextDouble();
		
		System.out.println("NOTA FINAL: " + al.notaFinal());
		
		if (al.notaFinal() >= 60) {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO");
			double falta = 60 - al.notaFinal();
			System.out.println("Faltou " + falta + " pontos");
		}
		
		sc.close();
	}

}
