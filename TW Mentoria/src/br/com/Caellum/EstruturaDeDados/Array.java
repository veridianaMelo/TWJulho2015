package br.com.Caellum.EstruturaDeDados;

public class Array {

	public static void main(String[] args) {

		int[] array = new int[10];
		
		array[5] = 10;
		System.out.println(array[5]);
		int[] array2 = new int[10];
		
		int n = 10;
		
		int[] numeroDeBilhete = new int[n];

		for(int i=0; i < array.length; i++){
			array[i] = i + 1;	
			//System.out.println(array[i]);
		}
		for(int j = 0; j < array.length; j++){
			array[j] = j;
			//System.out.println(array[j]);
		}


	}
}

