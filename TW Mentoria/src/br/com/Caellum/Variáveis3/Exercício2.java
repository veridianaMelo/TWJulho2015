package br.com.Caellum.Vari�veis3;

public class Exerc�cio2 {

	public static void main(String[] args) {

		int acumulador = 0;
		for(int i = 1; i <= 10; i++){
			acumulador += i;
			System.out.println(acumulador);	
		}
		System.out.println(acumulador);

	System.out.println("xxxxxxx");

	int a1 = 1;
	int an = 10;
	
	int somaPA = (a1 + an) * ((an - a1 + 1) / 2);
	System.out.println(somaPA);
	}
}
