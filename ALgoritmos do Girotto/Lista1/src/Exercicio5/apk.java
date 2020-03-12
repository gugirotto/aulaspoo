package Exercicio5;

import java.util.Scanner;

public class apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double contador;
		double resultado = 1;
		
		System.out.println("digite a base");
		double base = sc.nextDouble();
		System.out.println("digite o expoente");
		double expoente = sc.nextDouble();
		
		for (contador = 0; contador < expoente; contador++) {
			resultado *= base;
		}
		System.out.println(" o resultado é: " + resultado);
		sc.close();
	}

}
