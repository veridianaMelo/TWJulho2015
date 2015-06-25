package br.com.Caellum.OrientacaoObjetos;

public class TestaAlgunsMetodos {

	public static void main(String[] args) {
		
		Conta minhaConta1 = new Conta();
		
		Conta meuSonho = new Conta();
		
		meuSonho.saldo = 1500000;
		
		System.out.println(meuSonho.saldo);
		
		
		minhaConta1.saldo = 1000;
		boolean consegui = minhaConta1.sacar(2000);
		if(consegui){
			System.out.println("Consegui Sacar");
		}else{
			System.out.println("Não consegui sacar");
		}
		
		
		minhaConta1.saldo = 1000;
		if(consegui){
			System.out.println("Consegui Sacar");
		}else{
			System.out.println("Não consegui sacar");
		}
		
		minhaConta1.sacar(200);
		System.out.println(minhaConta1.saldo);
		
		minhaConta1.deposita(600);
		
		System.out.println(minhaConta1.saldo);

	}

}
