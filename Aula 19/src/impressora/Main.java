package impressora;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nomeContrato, nomeFoto, nomeDocumento;
		Impressora impressora = new Impressora();
		
		System.out.println("Nome do contrato: ");
		nomeContrato = sc.nextLine();
		Contrato contrato = new Contrato(nomeContrato);
		impressora.adicionarImprimivel(contrato);
		
		System.out.println("Nome da foto: ");
		nomeFoto = sc.nextLine();
		Foto foto = new Foto(nomeFoto);
		impressora.adicionarImprimivel(foto);
		
		System.out.println("Nome do documento: ");
		nomeDocumento = sc.nextLine();
		Documento documento = new Documento(nomeDocumento);
		impressora.adicionarImprimivel(documento);

		impressora.imprimirTudo();
		
	}
}
