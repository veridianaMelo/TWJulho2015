package br.com.Edmodo.IntroducaoAProgramacaoI;

import javax.swing.JOptionPane;

public class HoraDoExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lado1 = JOptionPane.showInputDialog("Entre com o lado 1 do tri�ngulo.");
		String lado2 = JOptionPane.showInputDialog("Entre com o lado 2 do tri�ngulo.");
		String lado3 = JOptionPane.showInputDialog("Entre com a lado 3 do tri�ngulo.");

		int ladoUm = Integer.parseInt(lado1);
		int ladoDois = Integer.parseInt(lado2);
		int ladoTres = Integer.parseInt(lado3);

		if( ladoUm == ladoDois && ladoUm == ladoTres){
			System.out.println("Lados Iguais ou Equil�tero.");
		} else if(ladoUm != ladoDois && ladoUm != ladoTres){
			System.out.println("Lados Diferentes ou Escaleno");
		} else{
			System.out.println("Is�sceles, dois lados iguais.");
		}
	}
}
