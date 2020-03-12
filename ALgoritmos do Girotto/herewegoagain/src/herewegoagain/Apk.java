package herewegoagain;

import java.util.Scanner;

public class Apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double altura = 0;
		System.out.println("bote tua alutra (com ,)");
		double h = sc.nextDouble();
		System.out.println("tu é home ou muie?");
		System.out.println("1-home");
		System.out.println("2-muie");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			altura = (72.7 * h) - 58;
			break;
		case 2:
			altura = (62.1 * h) - 44.7;
			break;
		default:
			System.out.println(" entrada invalida");
			break;
		}
		System.out.println(" teu peso ideal = " + altura);

		/*
		 * double f = sc.nextDouble();
		 * 
		 * double c = (5 * (f - 32) / 9);
		 * 
		 * System.out.println("esse numero em c é " + c);
		 */

	}

}
