package br.com.Caellum.EstruturaDeDados;

import br.com.Caellum.OrientacaoObjetos.Conta;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta[] minhasContas = new Conta[10];
		
		minhasContas[1] = new Conta();
		minhasContas[1].saldo = 3200;

		System.out.println(minhasContas[0].saldo);
		
		Conta[] contaNova = new Conta[10];
		contaNova[0].saldo = 1000.0; 
	}

}
