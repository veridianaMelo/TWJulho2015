
public class Calculadora {

	public double somar(double num1, double num2){
		return(num1 + num2);

	}

	public double subtrair(double num1, double num2){
		return(num1 - num2);
	}

	public double multiplicar(double num1, double num2){
		return(num1 * num2);
	}

	public double dividir(double num1, double num2){
		if (num2 == 0){
			return -1;
		}
		else
			return (num1 / num2);
	}

	public double potencia(double base, double expoente){
		double pot = base;
		if (expoente == 1){
			return base;
		}else{
			for(int i = 1; i < expoente; i++){
				pot *=  base;
			}
			return(pot);


		}
	}

	public int fatorial(int n){
		int fator = 1, i;
		if (n==0 || n==1){
			return 1;
		}else{
			for(i = 1; i <= n; i++){
				fator *= 1;	
			}
			return (fator);		

		}


	}

}
