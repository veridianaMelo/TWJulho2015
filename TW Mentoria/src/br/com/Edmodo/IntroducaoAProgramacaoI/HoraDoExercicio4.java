package br.com.Edmodo.IntroducaoAProgramacaoI;

import javax.swing.JOptionPane;

public class HoraDoExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String idade = JOptionPane.showInputDialog("Quantos anos voc� tem? Primeiro digite os anos");
		String meses = JOptionPane.showInputDialog("Agora digite os meses:");

		int idade1 = Integer.parseInt(idade);
		int meses1 = Integer.parseInt(meses);

		int idadeEmDias = ((idade1 * 365) + (meses1 * 30));
		int idadeEmHoras = (idadeEmDias * 24);

		System.out.println("A sua idade em dias s�o " + idadeEmDias + ".");
		System.out.println("A sua idade em horas s�o " + idadeEmHoras + ".");
	}

}
