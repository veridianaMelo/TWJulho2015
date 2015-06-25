package br.com.Edmodo.IntroducaoAProgramacaoI;

import java.util.Scanner;

public class HoraDoExercicio3 {

	public static void main(String[] args) {

		int somaPar = 0;
		int somaImpar = 0;
		for(int i = 0; i <= 100; i++){
			if(i % 2 == 0){
				somaPar += i;
			}else{
				somaImpar += i;
			}

		}
		System.out.println("A soma dos números pares é : " + somaPar);
		System.out.println("A soma dos números ímpares é : " + somaImpar);
	}
}
