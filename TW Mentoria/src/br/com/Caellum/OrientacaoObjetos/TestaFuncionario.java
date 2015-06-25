package br.com.Caellum.OrientacaoObjetos;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		
		func1.nome = "Hugo";
		func1.salario = 100;
		func1.recebeAumento(50);

		System.out.println("Salário Atual:" + func1.salario);
		System.out.println("Ganho Anual:" + func1.calculoGanhoAtual());
		
		func1.mostra();
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Danillo";
		f1.salario = 100;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Danillo";
		f2.salario = 100;
		
		Funcionario f3 = f1;
		
		if(f1==f3){
			System.out.println("Iguais.");
		}else{
			System.out.println("Diferentes");
		}
	}

}
