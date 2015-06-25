package br.com.Edmodo.IntroducaoAProgramacaoI;

public class HoraDoExercicio1 {

	public static void main(String[] args) {

		int c, anterior, atual, proximo;

		anterior = 0;
		atual = 1;

		for( c = 1; c <= 8; c++ ){
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			System.out.println("O valor de proximo é : " + proximo );
		//	System.out.println( "O valor de anterior:" + anterior );
			//System.out.println( "O valor de atual é:" + atual);
		}

	}
//          CHINÊS
//          c  ant	pro	atual
//          	0	0	1
//          1	1	1	1
//          2	1	2	2
//          3	2	3	3
//          4	3	5	5
//          5	5	8	8
//          6	8	13	13
//          7	13	21	21
//          8	21	34	34



}
