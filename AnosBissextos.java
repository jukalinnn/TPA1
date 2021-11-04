import java.util.Scanner;
public class AnosBissextos {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		int i=1, anoI=0, anoF=0;
		System.out.println("Entre com o ano inicial:");
		anoI = in.nextInt();
		System.out.println("Entre com o ano final:");
		anoF = in.nextInt();
		do {
			if(anoI%4==0) {
				System.out.println("O ano" +anoI+ "é bissexto");
			}else {
		}anoI++;
	
		}while(anoI<=anoF);
		
	}
	}









