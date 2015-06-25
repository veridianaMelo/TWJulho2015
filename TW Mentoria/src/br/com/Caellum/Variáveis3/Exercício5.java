package br.com.Caellum.Variáveis3;

public class Exercício5 {

	public static void main(String[] args) {
		
		long fatorial = 1;
		
		for(long i = 1; i <= 40; i++){
			
			while(i>=2){
			fatorial = fatorial * i;
			break;
		}System.out.println("O fatorial de i " + i + "é :" + fatorial);

	}

}}
