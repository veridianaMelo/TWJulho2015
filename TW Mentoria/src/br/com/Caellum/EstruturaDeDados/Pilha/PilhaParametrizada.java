package br.com.Caellum.EstruturaDeDados.Pilha;

public class PilhaParametrizada<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		private List<T> objetos = new LinkedList<T>();
		
		public void insere(T t){
			this.objetos.add(t);
		}
		public T remove(){
			return this.objetos.remove(this.objetos.size() - 1);
			
		}

		public boolean vazia(){
			return this.objetos.size == 0;
		}
	}

}
