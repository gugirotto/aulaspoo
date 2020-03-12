package Exercicio8;

import java.util.Scanner;

public class Apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a 1 nota");
		a=sc.nextInt();
		System.out.println("digite a 2 nota");
		b=sc.nextInt();
		System.out.println("digite a 3 nota");
		c=sc.nextInt();
		System.out.println("digite a 4 nota");
		d=sc.nextInt();
		
		System.out.println("as notas são : " + a + ", " + b+ ", " + c+ ", " + d);
		System.out.println("a media é: " + (a+b+c+d)/4);
		sc.close();
	}
	

}
