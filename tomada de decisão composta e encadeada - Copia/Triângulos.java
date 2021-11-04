import java.util.Scanner;
public class Triângulos {
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
			{System.out.println("Não é um triângulo.");}
		else if (a==b && a==c && c==b)
			{System.out.println("O triângulo é um equilátero.");}
		else if (a!=b && a!=c && c!=b)
			{System.out.println("O triângulo é um escaleno.");}
		else
			{System.out.println("O triângulo é um isósceles.");}
	}
}












