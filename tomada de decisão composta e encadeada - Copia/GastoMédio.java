import java.util.Scanner;

public class GastoM�dio {
public static void main(String args[]) {
	Scanner in=new Scanner (System.in);
	int km, ctl, consumo;
	System.out.println("Entre com a dist�ncia percorrida:");
	km = in.nextInt();
	System.out.println("Entre com a capacidade do tanque de combust�vel:");
	ctl = in.nextInt();
	consumo = km/ctl;
	System.out.println("O gasto m�dio de combustivel � de:"+consumo+" litros");
	if (consumo>=10) {
		System.out.println("Econ�mico.");
	}
	else {
		System.out.println("n�o econ�mico.");
		
	}

}

	
}

