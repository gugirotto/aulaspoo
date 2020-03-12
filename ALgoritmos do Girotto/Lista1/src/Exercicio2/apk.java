package Exercicio2;

import java.util.Scanner;

public class apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero int 1");
		int x = sc.nextInt();
		System.out.println("digite o 2 numero int");
		int y = sc.nextInt();
		System.out.println("digite o numero real (double)(,)");
		double z = sc.nextDouble();
		
		System.out.println(" o produto do dobro do primeiro com metade do segundo é: " + (2*x)*(y/2));
		System.out.println(" a soma do triplo do primeiro com o terceiro é : " + 3*x+z);
		System.out.println(" o terceiro elevado ao cubo é: " +  z * z *z );
		sc.close();
	}

}
