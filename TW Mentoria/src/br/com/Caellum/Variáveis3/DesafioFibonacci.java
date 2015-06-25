package br.com.Caellum.Variáveis3;
import javax.swing.JOptionPane;  

  
public class DesafioFibonacci {  
    public static void main(String[] args) {  
        try{  
        long n = Long.parseLong(JOptionPane.showInputDialog("Quantidade de termos Fibonacci:"));  
        verifica(n);  
        n--;  
        calcula(n);  
        }catch(NumberFormatException a){  
            JOptionPane.showMessageDialog(null, "Escolha a quantidade de termos correta");  
        }  
        catch(Exception e){  
            JOptionPane.showMessageDialog(null, "Escolha a quantidade de termos correta");  
        }  
    }  
    private static void calcula(long n) {  
        long k=1;  
        long j=1;  
        String mostrar="1-1-";  
        for(int i=1;i<n;i++){  
            k+=j;  
            j=k-j;  
            if(i==n-1){  
                mostrar += k;  
            }  
            else{     
            mostrar += k+"-";  
            }  
        }  
          
        JOptionPane.showMessageDialog(null, mostrar);  
    }  
    static void verifica(long n){  
        if(n==0||n<0){  
            JOptionPane.showMessageDialog(null, "Escolha a quantidade de termos correta"); main(null);}  
        if(n==1){  
            JOptionPane.showMessageDialog(null, "1");System.exit(0);}  
        if(n==2){  
            JOptionPane.showMessageDialog(null, "1-1");System.exit(0);}  
    }  
}  

