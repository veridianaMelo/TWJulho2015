package br.com.Edmodo.ExercicioII;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] array = new int[3];
		int v = 0;

		System.out.println("Digite um n�mero inteiro p armazenar em V.");
		Scanner teclado = new Scanner(System.in);
		v = teclado.nextInt();
		System.out.println("O valor de v � :" + v);

		for(int i = 0; i < array.length; i++){
			System.out.println("Digite um n�mero p armazenar no array:");
			Scanner teclado1 = new Scanner(System.in);
			int a = teclado1.nextInt();
			array[i] = a;
		}
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		for(int i = 0; i < array.length; i++){
			if(array[i] == v){
				System.out.println("V est� no Array");
			}else{
				System.out.println("V n�o est� no Array");

			}
		}


	}

}
