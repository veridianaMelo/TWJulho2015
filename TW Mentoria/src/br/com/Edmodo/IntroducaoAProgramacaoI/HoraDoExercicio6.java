package br.com.Edmodo.IntroducaoAProgramacaoI;
import java.util.Scanner;

public class HoraDoExercicio6 {

	public static void main(String[] args) {
		System.out.println("Qual sua data de nascimento? Digite o ano:");
		Scanner teclado = new Scanner(System.in);
		int ano = teclado.nextInt();
		int anoAtual = 2015;
		int idade = anoAtual - ano;

		System.out.println("Agora digite o m�s:");
		Scanner teclado1 = new Scanner(System.in);
		int mes = teclado1.nextInt();
		int mesAtual = 6;
		if(mes > mesAtual){
			idade = idade - 1;
			System.out.println(idade);
			System.out.println("Data Nascimento :"  + "/" + mes +  "/" + ano);
		}else if(mes <= mesAtual){
			System.out.println(idade);	
			System.out.println("Data Nascimento :"  + "/" + mes +  "/" + ano);
		}
		if (idade >= 5 && idade <= 7){
			System.out.println("Infantil A  5 - 7 anos.");
		} else if( idade >= 8 && idade <= 10){
			System.out.println("Infantil B  8 - 10 anos.");
		} else if( idade >=11 && idade <= 13){
			System.out.println("Juvenil  A  11 - 13 anos.");		
		} else if(idade >= 14 && idade <= 17){
			System.out.println("Juvenil  B  14 - 17 anos.");
		} else if (idade >= 18){
			System.out.println("Adulto Maiores de 18 anos.");	
		}
	}
	}
