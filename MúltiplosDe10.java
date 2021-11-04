import java.util.Scanner;
public class MúltiplosDe10 {
	public static void main(String args[]) {
		int mult=10, i=0;
		
		do {
			i++;
			if(i%mult==0) {
				System.out.println(mult+" Número-Múltiplo de 10.");
				
				mult=mult+10;
			}else {
				System.out.println(i);
			}
		}while (i<301);
	}
}









