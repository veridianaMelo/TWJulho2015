package br.com.Edmodo.ExercicioIII;

public class TestesFuncionario {

	public static void main(String[] args) {
		
		 Funcionario f1 = new Funcionario();
		 f1.setNome("jose");
		 f1.setSalario(1000);
		 f1.calculaGanhoAtual();
		 
		 System.out.println(f1.calculaGanhoAtual());
		 f1.recebeAumento(23);
		 
		 
		 f1.mostra();
		 
		 Data dt = new Data();
		 
		 dt.ano = 2015;
		 dt.mes = 10;
		 dt.dia = 1;
		 
		 dt.mostraData();

	}

}
