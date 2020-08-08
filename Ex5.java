package ex5;

import java.util.Scanner;

public class Ex5 {
	public static void main(String args[]) {
		
		Scanner ler= new Scanner(System.in);
		int a,b,c;
		float media;
		
		System.out.println("Entre com o primeiro valor: ");
		a=ler.nextInt();
		System.out.println("Entre com o segundo valor: ");
		b=ler.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		c=ler.nextInt();
		
		
		media=(a*2+b*3+c*5)/10;
		
		System.out.printf("A média é : "+ media);

}
}