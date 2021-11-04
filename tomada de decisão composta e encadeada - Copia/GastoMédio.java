import java.util.Scanner;

public class GastoMédio {
public static void main(String args[]) {
	Scanner in=new Scanner (System.in);
	int km, ctl, consumo;
	System.out.println("Entre com a distância percorrida:");
	km = in.nextInt();
	System.out.println("Entre com a capacidade do tanque de combustível:");
	ctl = in.nextInt();
	consumo = km/ctl;
	System.out.println("O gasto médio de combustivel é de:"+consumo+" litros");
	if (consumo>=10) {
		System.out.println("Econômico.");
	}
	else {
		System.out.println("não econômico.");
		
	}

}

	
}

