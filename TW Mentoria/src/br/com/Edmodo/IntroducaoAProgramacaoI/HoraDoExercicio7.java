package br.com.Edmodo.IntroducaoAProgramacaoI;

import java.util.Scanner;

public class HoraDoExercicio7 {

	public static void main(String[] args) {

		Calculadora numero = new Calculadora();

		System.out.println("Digite um n�mero :");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();

		System.out.println("Digite outro n�mero :");
		Scanner teclado2 = new Scanner(System.in);
		int v = teclado2.nextInt();

		System.out.println(numero.dividir(n, v));
		System.out.println(numero.multiplicar(n, v));
		System.out.println(numero.somar(n, v));
		System.out.println(numero.subtrair(n, v));
		








	}
}
