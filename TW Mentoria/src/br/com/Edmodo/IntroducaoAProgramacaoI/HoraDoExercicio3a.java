package br.com.Edmodo.IntroducaoAProgramacaoI;

public class HoraDoExercicio3a {

	public static void main(String[] args) {

		int somaPar = 0;
		int somaImpar = 0;
		int i = 0;
		while (i < 100){
			if(i % 2 == 0){
				somaPar += i;
			}else{
				somaImpar += i;
			}
			i++;
		}
		System.out.println("A soma dos números pares é : " + somaPar);
		System.out.println("A soma dos números ímpares é : " + somaImpar);
	}
}




