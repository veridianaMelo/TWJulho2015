package br.com.Caellum.EstruturaDeDados;

public class TesteInformarTamanhoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.tamanho());
		
		lista.adiciona(a3);
		
		System.out.println(lista.tamanho());
	}

}
