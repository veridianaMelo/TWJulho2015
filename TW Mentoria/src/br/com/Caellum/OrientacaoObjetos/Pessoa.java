package br.com.Caellum.OrientacaoObjetos;

public class Pessoa {

	String nome;
	int idade;
	
	void fazAniversario(){
		System.out.println("Felicidades !!!");
		this.idade += 1;
		System.out.println(" Aniversariante " + this.nome + " idade: " + this.idade);
	}
}
