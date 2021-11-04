import java.util.Scanner;
public class Raizes {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double a, b, c, delta, rDelta, x1, x2;
		System.out.println("Entre com o valor de A:");
		a = in.nextDouble();
		System.out.println("Entre com o valor de B:");
		b = in.nextDouble();
		System.out.println("Entre com o valor de C:");
		c = in.nextDouble();
		delta = (b*b)- 4*a*c;
		if(delta<0)
		{System.out.println("Não existem raízes para essa equação.");}
		else if (delta==0)
		{x1 = (-b) / (2*a);
		System.out.println("existe uma raiz real");
		System.out.println("x1 = "+x1);}
		else
		{rDelta = Math.sqrt(delta);
		x1 = (-b+rDelta) / (2*a);
		x2 = (-b-rDelta) / (2*a);
		System.out.println("Existem 2 raízes reais para essa equação.");
		System.out.println("x1 = "+x1+" x2 = "+x2);}
		
		}
	}


