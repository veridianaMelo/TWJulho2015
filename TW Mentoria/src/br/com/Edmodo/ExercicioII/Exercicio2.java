package br.com.Edmodo.ExercicioII;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int[] array = new int[3];

		for(int i = 0; i < array.length; i++){

			System.out.println("Digite um n�mero:");
			Scanner teclado = new Scanner(System.in);
			int a = teclado.nextInt();
			array[i] = a;
		}
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);

		}
		for(int i = 0; i < array.length; i++){

			if(array[i] >= 10){
				int x  = 1;	
				int maior10 = x++;
				System.out.println("N�meros maiores ou iguais a 10 foram um total de :" + x);

			}

		}}}



