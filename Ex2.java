package ex2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		
		Scanner ler= new Scanner(System.in);
		int idadeanos, idademeses, idadedias, resto;
		System.out.println("Quantos dias de vida você tem?: ");
		idadedias=ler.nextInt();
		
		idadeanos=idadedias/365;
		idademeses=(idadedias%365)/30;
		resto=(idadedias%365)%30;
		
		System.out.printf("Sua idade em anos, meses e dias é de: "+ idadeanos + " anos, "+idademeses+" meses e"+resto+ " dias!");
			
	
}
}
