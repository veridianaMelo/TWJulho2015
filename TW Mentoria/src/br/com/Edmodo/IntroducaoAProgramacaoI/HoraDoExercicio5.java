package br.com.Edmodo.IntroducaoAProgramacaoI;

import java.util.Scanner;

public class HoraDoExercicio5 {

	public static void main(String[] args) {

		int x = 0;
		do{
			System.out.println("Digite um número:");
			Scanner ler = new Scanner(System.in);
			x = ler.nextInt();
			if(x % 2 == 0){
				x = x/2;

			}else if
			(x % 2 != 0){
				x = 3 * x + 1;
			}
			System.out.println(x);
		}while(x!=0);
	}
}

