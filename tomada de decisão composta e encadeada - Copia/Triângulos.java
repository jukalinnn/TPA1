import java.util.Scanner;
public class Tri�ngulos {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int a, b, c;
		System.out.println("Entre com o valor de A:");
		a = in.nextInt();
		System.out.println("Entre com o valor de B:");
		b = in.nextInt();
		System.out.println("Entre com o valor de C:");
		c = in.nextInt();
		if (a>b+a || b>a+c || c>a+b) 
			{System.out.println("N�o � um tri�ngulo.");}
		else if (a==b && a==c && c==b)
			{System.out.println("O tri�ngulo � um equil�tero.");}
		else if (a!=b && a!=c && c!=b)
			{System.out.println("O tri�ngulo � um escaleno.");}
		else
			{System.out.println("O tri�ngulo � um is�sceles.");}
	}
}












