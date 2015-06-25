package br.com.Caellum.OrientacaoObjetos;

public class Conta {

	int numero ;
	public double saldo ;
	double limite ;
	Cliente titular = new Cliente();

	boolean sacar(double valor){
		if(valor > this.saldo){
			return false;
		}else{
			this.saldo =  this.saldo - valor;
			return true;
		}
	}

	public void deposita(double valor){
		this.saldo +=  valor;
	}

	boolean transfere(Conta destino, double valor){
		boolean retirou = this.sacar(valor);
		if(retirou == false){
			return false;
		}else{
			destino.deposita(valor);
			return true;
		}
	}
	}

