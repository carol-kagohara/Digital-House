package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println("Olá mundo");
		
//		int idade = 15;
//		String nome = "Carol";
//		double nota = 10.5;
//		char letra = 'a';
		
		//System.out.println(nome + " tem " + idade + " anos de idade");
		
		//if(!(idade >= 16) && idade < 18) {
			//System.out.println(nome + " pode votar mas não é obrigatório");
		//} else {
			//System.out.println(nome + " é menor de idade");
		//}
		
//		for(int i = 0; i < 11; i++) {
//			System.out.println(8*i);
//		}
		
//		int i = 0;
//		while(i < 11 ) {
//			System.out.println("8 x " + i + " = " + 8 * i);
//			i = i + 1;
//		}
		
		//		Scanner sc = new Scanner(System.in);
		//		int op = 0;
		//		double num1 = 0, num2 = 0;
		
		//		do {
		//			menu();
		//			op = sc.nextInt();
						
		//			if(op < 5 && op > 0) {
		//				System.out.println("DIGITE UM NÚMERO: ");
		//				num1 = sc.nextInt();
		//				System.out.println("DIGITE UM NÚMERO: ");
		//				num2 = sc.nextInt();
		//			}
			
		//			switch(op) {
		//				case 1: somar(num1,num2);
		//						break;
		//				case 2: subtrair(num1,num2);
		//						break;
		//				case 3: multiplicar(num1,num2);
		//						break;
		//				case 4: dividir(num1,num2);
		//						break;
		//				case 5: System.out.println("OBRIGADA! VOLTE SEMPRE!");
		//						break;
		//				default: System.out.println("OPÇÃO INVÁLIDA");
//			}		
//		} while(op != 5);
		
		int [] numeros = {2,3,4,5,6};
		int [] numeros2 = new int[5];
		
		int [][] matriz = new int [2][2];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void menu() {
		System.out.println("ESCOLHA UMA OPÇÃO:");
		System.out.println("1 - SOMAR");
		System.out.println("2 - SUBTRAIR");
		System.out.println("3 - MULTIPLICAR");
		System.out.println("4 - DIVIDIR");
		System.out.println("5 - SAIR");		
	}
	public static void somar(double num1, double num2) {
		System.out.println("O RESULTADO DA OPERAÇÃO É: " + (num1 + num2));
	}
	
	public static void subtrair(double num1, double num2) {
		System.out.println("O RESULTADO DA OPERAÇÃO É: " + (num1 - num2));
	}
	
	public static void multiplicar(double num1, double num2) {
		System.out.println("O RESULTADO DA OPERAÇÃO É: " + (num1 * num2));
	}
	
	public static void dividir(double num1, double num2) {
		System.out.println("O RESULTADO DA OPERAÇÃO É: " + (num1 / num2));
	}
}
