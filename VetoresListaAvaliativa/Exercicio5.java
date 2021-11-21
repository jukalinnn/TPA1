import java.util.Scanner;
public class Exercicio5 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int a[], b[], i, fat, n;
			final int TAM = 15;
			a = new int [TAM];
			b = new int [TAM];
			
			for(i=0;i<TAM;i++) {
				System.out.println("Insira o "+(i+1)+" número que queira o fatorial: ");
				a[i] = input.nextInt();
				
				fat = 1;
				
				for(n = a[i]; n > 1; n--) {
					fat = fat*n;
					b[i] = fat;
				}
			}
			for(i=0;i<TAM;i++) {
				
				if(b[i]!=0) {
					System.out.println("O fatorial de "+a[i]+" é igual a "+b[i]+".");
					
				}else {
					System.out.println("O fatorial de "+a[i]+" é igual a 1.");
					
			}
		}
	}
}