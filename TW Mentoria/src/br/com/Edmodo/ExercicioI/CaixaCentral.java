package br.com.Edmodo.ExercicioI;

import java.util.Scanner;

public class CaixaCentral {

	public static void main(String[] args) {	
		
		AjudaBanqueiro bco = new AjudaBanqueiro();
		AjudaBanqueiro bco1 = new AjudaBanqueiro();

		bco.saldo = 1000;
		

		System.out.println("CAIXA ELETRONICO MEUBANCO");
		System.out.println("1 - SACAR");
		System.out.println("2 - DEPOSITAR");
		System.out.println("3 - TRANSFER�NCIA");
		System.out.println("4 - CONSULTAR NOTAS");
		System.out.println("5 - VERIFICAR CAIXA");
		System.out.println("6 - SAIR");

		System.out.println("Digite a op��o dejesada:");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int menuEscolha = n;

		switch (menuEscolha) {
		case 1:		
			bco.saque(100);
			System.out.println("******SAQUE OK*************");
			break;
		case 2:
			bco.depositar(1333);
			System.out.println("******DEP�SITO REALIZADO COM SUCESSO********");
			break;
		case 3:
			bco.transferir(bco1, 1);
			System.out.println("Saldo Conta Transferida :  " + bco1.saldo);
			
			System.out.println("********TRANSFER�NCIA REALIZADA COM SUCESSO******");
			break;
		case 4:
			System.out.println("Consultar Notas");
			bco.consultarNotas(150);
			break;
		case 5:
			System.out.println("Verificar Caixa");
			System.out.println("Sald Conta Atual : " + bco.saldo);
			break;
		case 6:
			System.out.println("Sair");
			break;
		default:

			System.out.println("Nenhuma das op��es!");

		}
		
		
		
	}

}
