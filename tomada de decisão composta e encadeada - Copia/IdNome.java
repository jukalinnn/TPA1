import java.util.Scanner;
public class IdNome {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int nome, id, idMaior, idMenor, nomeMaior, nomeMenor;
		System.out.println("Entre com o primeiro nome:");
		nome= in.nextInt();
		System.out.println("Entre com a primeira idade:");
	    id = in.nextInt();
		nomeMaior=nome;
		idMaior=id;
		idMenor=id;
		nomeMenor=nome;
		System.out.println("Entre com o segundo nome:");
		nome = in.nextInt();
		System.out.println("Entre com a segunda idade:");
		id = in.nextInt();
		if (id>idMaior)
		{idMaior=id;
		nomeMaior=nome;}
		else if (id<idMenor)
		{idMenor=id;
		nomeMenor=nome;}
		System.out.println("Entre com o terceiro nome:");
		nome= in.nextInt();
		System.out.println("Entre com a terceira idade:");
		id= in.nextInt();
		if (id>idMaior)
		{idMaior = id;
		nomeMaior=nome;}
		else if (id<idMenor)
		{idMenor=id;
		nomeMenor=nome;}
		System.out.println("Entre com o querto nome:");
		nome=in.nextInt();
		System.out.println("Entre com a querta idade:");
		id=in.nextInt();
		if (id>idMaior)
		{idMaior=id;
		nomeMaior=nome;}
		else if (id<idMenor)
		{idMenor=id;
		nomeMenor=nome;}
		System.out.println("Entre com o quinto nome:");
		nome=in.nextInt();
		System.out.println("Entre com a quinta idade:");
		id=in.nextInt();
		if (id>idMaior)
		{idMaior=id;
		nomeMaior=nome;}
		else if (id<idMenor)
		{idMenor=id;
		nomeMenor=nome;}
		System.out.println(+nomeMaior+"é o mais velho com"+idMaior+"anos.");
		System.out.println("E"+nomeMenor+"é o mais novo com"+idMenor+"anos.");	
	}

}

