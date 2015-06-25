package br.com.Caellum.EstruturaDeDados.Pilha;

import javax.swing.JOptionPane;

public class Addition {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstNumber = JOptionPane.showInputDialog("Digite um número");
		String secondNumber = JOptionPane.showInputDialog("Digite outro número");
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null,"The sum is" + sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
	}

}
