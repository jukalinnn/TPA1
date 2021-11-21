import java.util.Scanner;
public class Exercicio6 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int a[], b[], c[], i, gb, gc;
			final int TAM = 10;
			a = new int [TAM];
			b = new int [TAM];
			c = new int [TAM];
			
			for(i=0;i<TAM;i++) {
				System.out.println("Digite o " +(i+1)+ " do grupo a:");
				a[i] = leia.nextInt();
			}
			
			System.out.println("     ");
			
			for(gb=0; gb<TAM; gb++) {
				System.out.println("Digite o " +(gb+1)+ " do grupo B:");
				b[gb] = leia.nextInt();
				
				for(i=0, gc=0; i<TAM; i++, gc++) {
					
					if(a[i]==b[gb]) {
						c[gc] = a[i];
					}
				}
			}
			
			System.out.println("       ");
			
			System.out.print("Interseção do grupo A e B: ");
			
			for(gc=0; gc<TAM; gc++) {
				
				if(c[gc]!=0) {
					System.out.print(c[gc]+" ");
					
			}
		}
	}
}
