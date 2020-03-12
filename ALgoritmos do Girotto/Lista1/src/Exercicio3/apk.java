package Exercicio3;

import java.util.Scanner;

public class apk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o seu turno de aula ( M V ou N)");
		String aula = sc.next();
		
		if (aula.equals("M")){
			System.out.println("Bom dia ");	
		} else if( aula.equals("V")) {
			System.out.println("Boa tarde");
		} else if (aula.equals("N")) {
			System.out.println("Boa noite");
		}else {
			System.out.println(" entrada invalida");
		}
		sc.close();

	}

}
