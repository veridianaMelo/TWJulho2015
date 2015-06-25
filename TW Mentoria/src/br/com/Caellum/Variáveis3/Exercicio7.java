package br.com.Caellum.Variáveis3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i < 9; i ++){
		System.out.println("Insira um número :");

		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();

		if(n % 2 == 0){
			n = n / 2;
			System.out.println(n);
		} else {
			n = 3 * n + 1;
			System.out.println(n);
		}

	}

}}
