package br.com.Caellum.EstruturaDeDados;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Julio");
		a2.setNome("Paulo");
		a3.setNome("Rafael");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(0, a2);
		lista.adiciona(1, a3);
		
		System.out.println(lista);
	}

}
