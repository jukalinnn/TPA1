
import java.util.Scanner;
public class Exercicio9 {
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int a[],c=0;
			final int TAM = 10;
			a = new int [TAM];
			boolean palindromo=true;
			    
		    //lendo o vetor a
			for (int i = 0; i <TAM ; i++) {
		      System.out.println("Digite o "+(i+1)+" n�mero:");
			  a[i] = in.nextInt();
		     }
			
			//conferindo se � palindromo
			for (int i = TAM-1; i >=0 ; i--) {
				 if(a[i]==a[c]){
				 palindromo = true;
				 }else{
				  palindromo = false;
				  break;
				 }
				 c++;
		}
			//apresentando
			if (palindromo){
			System.out.println("O vetor � pal�ndromo.");
			}else {
			System.out.println("O vetor n�o � pal�ndromo.");
			}



	  }
	}