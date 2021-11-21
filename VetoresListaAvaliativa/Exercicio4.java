import java.util.Scanner;
public class Exercicio4 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int a[], i, b, r;
			final int TAM = 11;
			a = new int [TAM];
			
			
			for(i=0; i<TAM; i++) {
				r=1;
				
				System.out.println("Digite o expoente: ");
				a[i] = leia.nextInt();
				
				for(b=0; b<a[i]; b++) {
					r = (2*r);
					
				}
				System.out.println( a[i]+" elevado a 2 = "+r+"\n");
		}
	}

}