import java.util.Scanner;
public class idades {
	public static void main (String args[]) {
		int i=1;
		int idade, maior=0, menor=0;
		while (i<=10) {
			System.out.println("Entre com a idade do "+i+" aluno:");
			idade= in.nextInt();
			idade++;
			if (idade<18) {
				System.out.println("Menor de idade.");
				menor++;
			}else {
				System.out.println("Maior de idade.");
				maior++;
			}
			i++;
		}
		System.out.println(menor+"alunos são menores de idade");
		System.out.println(maior+"alunos são maiores de idade");
	}

}
