package br.com.Caellum.OrientacaoObjetos;

public class Porta {

	String aberta;
	String cor;
	String dimensaoX;
	String dimensaoY;
	String dimensaoZ;

	void abre(){
		System.out.println(" Porta Aberta!!!");
	}

	void fecha(){
		System.out.println(" Porta Fechada!!!");
	}

	void pinta(String s){
		this.cor = s;
		System.out.println(this.cor);

	}


}
