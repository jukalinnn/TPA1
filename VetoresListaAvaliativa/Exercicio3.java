import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, i, resto0=0, a[];
		a = new int[5];
		
		for (int j=0; j<5; j++) {
			resto0=0;
			//ler um numero e verificar se � primo
			
			System.out.println("Insira um numero inteiro: ");
			a[j] =  leia.nextInt();
			
			//verificar se o resto da divisao � zero
			for (i=1; i<=a[j]; i++) {
				if (a[j]%i == 0) {
					resto0++;
				}
			}
			//verificando se o numero � primo ou nao
			if (resto0 > 2) {
				System.out.println("N�o � primo");
			}else {
				System.out.println("� primo");
			}
		} //fechando o vetor
	}
}
