package br.com.Edmodo.ExercicioII;

public class Exercicio1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];

		
		for(int i = 0; i < 10; i++){
			
			if (i==0){
			array[0] = 3;
			}
			else if(i==1){
			array[1] = 4;
			}
			else if(i >= 2){
				int x = 2;	
				int contador = ++x + 1;
				array[i] = ((array[1] - array[0]) +  contador);
			}
			System.out.println(array[i]);
			
			
			
			
	}

}}
