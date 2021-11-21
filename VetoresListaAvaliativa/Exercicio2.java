import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, r, i, a[];
		
		a = new int[5];
		
		for(int j=0; j<5; j++) {	
			System.out.println("Insira o valor da tabuada: ");
			a[j] = leia.nextInt();
		
			for(i=1; i<=10; i++) {
				r = a[j]*i;
				System.out.println(a[j]+"*"+i+"="+r);
			}
		}
	}
}
