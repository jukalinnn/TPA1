import java.util.Scanner;
public class IMC {
		public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		double p, al, imc;
		System.out.println ("Entre com o peso:");
		p = in.nextDouble();
		System.out.println ("Entre com a altura:");
		al= in.nextDouble();
		imc = p/(al*al);
		System.out.println("Seu IMC é:"+Math.round(imc));
		if(imc<18.5)
		{System.out.println("Excesso de magreza.");}
		else if(imc>=25)
		{System.out.println("Peso normal.");}
		else if(imc<=30)
		{System.out.println("Excesso de peso.");}
		else if(imc<=35)
		{System.out.println("Obesidade Grau 1.");}
		else if(imc<=40)
		{System.out.println("Obesidade Grau 2.");}
		else
		{System.out.println("Obesidade Grau 3.");}
		in.close();
	}
}
