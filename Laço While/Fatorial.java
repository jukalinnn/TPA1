import java.util.Scanner;
public class Fatorial {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		int i=1, mult=1, n;
		System.out.println("Entre com o n�mero:");
		n=in.nextInt();
		while(i<=n) {
			mult=mult*i;
			i++;
		}
		System.out.println("O fatorial desse n�mero �:"+mult);
			
	}
}
