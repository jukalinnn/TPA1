
import java.util.Scanner;
public class Exercicio8 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int a[], b=0, i, ii, r=0;
			final int TAM = 10;
			a = new int [TAM];
			
			//lendo o vetor a
			for(i=0;i<TAM;i++) {
				System.out.println("Digite o "+(i+1)+ "o número:");
				a[i] = input.nextInt();
			}
			
			System.out.println("   ");
			
			//lendo valor x
			for(ii=0; ii<TAM; ii++) {
				System.out.println("Digite o número X a ser buscado:");
				b = input.nextInt();
				
				//conferindo valores iguais
				for(i=0, ii=0; i<TAM; i++, ii++) {
					if(a[i]==b) {
						r = 1;
						
					}
				}
			}
			
			System.out.println("   ");
			
			//apresentando
			if(r==1) {
				
				System.out.println("O número "+b+" está dentro do vetor.");
				
			}else{
				
				System.out.println("O número "+b+" não está dentro do vetor.");
			}
		}
	}