import java.util.Scanner;
public class N�merosAleatorios {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		
		int i=1, n, maior, menor, novoN;
		
		System.out.println("Digite a quantidade de n�meros:");
		novoN=in.nextInt();
		System.out.println("Digite um n�mero:");
		n=in.nextInt();
		maior=n;
		menor=n;
		do {
			System.out.println("Digite um n�mero:");
			n=in.nextInt();
			if(n>maior) {
			maior=n;
		  } else if (n<menor) {
			  menor=n;
		  }
			i++;
	}while (n!=0);
		System.out.println(maior+" � o n�mero maior");
}
}















