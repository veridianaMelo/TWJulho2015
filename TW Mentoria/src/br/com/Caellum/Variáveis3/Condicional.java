package br.com.Caellum.Vari�veis3;

public class Condicional {

	public static void main(String[] args) {

		int idade = 15;
		boolean amigoDoDono = true;
		if(idade < 18 && !amigoDoDono){
			System.out.println("N�o pode entrar");
		}else{
			System.out.println("Pode entrar");
		}
		int mes = 1;
		if(mes==1){
			System.out.println("Voc� deveria estar de f�rias.");
		}
		System.out.println("*********************************");
		int idadePessoa = 15;
		while(idadePessoa < 18){
			System.out.println(idadePessoa);
			idadePessoa = idadePessoa + 1;
		}
		System.out.println("********************************");
		int i = 0;
		while (i < 10){
			System.out.println(i);
			i = i + 1;
		}

		for(int y=0; y<10; y = y+1){
			System.out.println("Ol�!");

		}
		int h = 0;
		while(h < 10){
			System.out.println("Hello World!!!");
			h = h + 1;

		}

		for(int u = 0; u < 100; u++){
			if(u > 50 && u < 60){
				System.out.println(u);
				continue;

			}
			//	System.out.println(u);

		}
        int iii;
        if(!true){
        	i = 5;
        }else{
        	i = 10;
        }System.out.println(i);
        
        int t;
        for(t = 0; t < 10; t++){
        	System.out.println("Ol�!!!!");
        }
        System.out.println(t);
        
        
        
	
	}

}
