package pacoteJava;

import java.util.*;

public class ex4 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		double num;
		
		System.out.println("entre com um valor: ");
		num=ler.nextInt();
		
		if(num%2==0)
		{
			num=Math.sqrt(num);
			System.out.println("\n� par");
			
		}
		else
		{
			num=Math.pow(num, 2);
			System.out.println("\n� impar");
		}
		
		System.out.println("Valor �: "+num);
	}

}
