package br.com.Caellum.OrientacaoObjetos;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta minhaConta = new Conta();
	//	Cliente meuSonho = new Cliente();
		
		//minhaConta.titular = meuSonho;
		
		
		minhaConta.titular.nome = "Manoel";
		
		Cliente clienteDaMinhaConta = minhaConta.titular;
		clienteDaMinhaConta.nome = "Duke";
		
		minhaConta.titular.nome = "Duke";
		
		
	}

}
