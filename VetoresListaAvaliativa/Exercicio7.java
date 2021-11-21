import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a[], b[], c[], i, j, k=0;
		boolean encontrado;
		
		a = new int[10];
		b = new int[10];
		c = new int[10];
		
		//lendo vetor A
		for(i=0; i<10; i++) {
			System.out.println("Insira o "+(i+1)+" valor do vetor a: ");
			a[i] = leia.nextInt();
		} 
		
		System.out.println("       ");
		
		//lendo vetor B
		for(j=0; j<10; j++) {
			System.out.println("Insira o "+(j+1)+" valor do vetor b: ");
			b[j] = leia.nextInt();
		}
		
		//rotina de verificação
		for(i=0; i<10; i++) {
			encontrado = false;
			for(j=0; j<10; j++) {
			if(a[i]==b[j]) {
				encontrado = true;
			}
		}
		if (encontrado == false) {
			c[k]=a[i];
			System.out.println("A diferença entre A e B é: "+c[k]);
			k++;
			}
		}
	
	}
}

