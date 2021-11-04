import java.util.Scanner;
public class AprovdReprovd {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double n1, n2, media, exame, novaM;
		System.out.println("Entre com aprimeira nota:");
		n1=in.nextDouble();
		System.out.println("Entre com a segunda nota:");
		n2=in.nextDouble();
		media=n1+n2/2;
		System.out.println("Sua média é"+media);
		if (media<3)
		{System.out.println("Reprovado.");}
		else if (media>=6)
		{System.out.println("Aprovado.");}
		else if (media>=3 && media<6)
		{System.out.println("Em exame.");}
		System.out.println("Entre com a nota do exame:");
		exame=in.nextDouble();
		novaM=exame+media/2;
		if (novaM>=6)
		{System.out.println("Aprovado.");}
		else
			{System.out.println("Reprovado.");}	
	}

}
