package br.com.Caellum.OrientacaoObjetos;

public class Carro {

	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
    Motor motor;
	
	void ligar(){
		System.out.println("O carro está ligado.");
	}
	
	void mostra(){
		System.out.println("Cor :" + this.cor);
		System.out.println("Modelo :" + this.modelo);
		System.out.println("Velocidade Atual :" + this.velocidadeAtual);
		System.out.println("Velocidade Média :" + this.velocidadeMaxima);
		System.out.println("Motor do Carro :" + this.motor);
	}

	void acelera(double quantidade){
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}

	int pegaMarcha(){
		if(this.velocidadeAtual < 0){
			return -1;
		}
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40){
			return 1;
		}
		if(this.velocidadeAtual>=40 && this.velocidadeAtual < 80){
			return 2;
		} return 3;
	}
}
