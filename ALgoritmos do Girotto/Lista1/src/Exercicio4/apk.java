package Exercicio4;

import java.util.Scanner;

public class apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um ano pia");
		int ano=sc.nextInt();
		
		if (ano % 4 == 0 ) {
			System.out.println("o ano é bisexto");
		} else {
			System.out.println("o ano n é bisexto");
		}
		sc.close();

	}

}
