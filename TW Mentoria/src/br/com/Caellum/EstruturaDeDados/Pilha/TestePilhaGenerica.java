package br.com.Caellum.EstruturaDeDados.Pilha;

public class TestePilhaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilhaParametrizada<Peca> pilhaDePecas = new PilhaParametrizada<Peca>();
		
		Peca peca = new Peca();
		
		pilhaDePecas.insere(peca);
		
		Peca pecaRemovida = pilhaDePecas.remove();
		
		if(peca != pecaRemovida){
			System.out.println("Erro: a peça removida não é igual" + "a que foi inserida");
		}
		
		if(!pilhaDePecas.vazia()){
			System.out.println("Erro: a pilha não está vazia");
		}
		PilhaParemetrizada<String> pilhaDeString = new PilhaParametrizada<String>();
		
		pilhaDeString.insere("Manoel");
		pilhaDeString.insere("Zuleide");
		
		System.out.println(pilhaDeString.remove());
		System.out.println(pilhaDeString.remove());
		

	}

}
