package br.com.Caellum.OrientacaoObjetos;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada;
	String rg;
	
	
	public void recebeAumento(double valor){
		this.salario = this.salario + valor;
		
	}
	
	double calculoGanhoAtual(){
		return this.salario * 12;
		
	}
	
	void mostra(){
		System.out.println("Nome Funcion�rio:" + this.nome);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Sal�rio:" + this.salario);
		System.out.println("Dia Admiss�o" + this.dataDeEntrada.Dia);
		System.out.println("M�s Admiss�o" + this.dataDeEntrada.Mes);
		System.out.println("Ano Admiss�o" + this.dataDeEntrada.Ano);
		System.out.println("RG" + this.rg);
	}
	
}
