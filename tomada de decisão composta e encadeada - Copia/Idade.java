import java.util.Scanner;
public class Idade {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int anoAtual, anoNasc, idade;
		System.out.println("Entre com o ano atual:");
		anoAtual= in.nextInt();
		System.out.println("Entre com o ano de nascimento:");
		anoNasc= in.nextInt();
		idade=anoAtual-anoNasc;
		System.out.println("Voc� tem" +idade+ "anos de idade.");
		if (idade<10)
		{System.out.println("� uma crian�a");}
		else if (idade>=10 && idade<18)
		{System.out.println("� um adolescente.");}
		else if (idade>=18 && idade<60)
		{System.out.println("� um adulto.");}
		else
		{System.out.println("� um idoso.");}	
	}
}
