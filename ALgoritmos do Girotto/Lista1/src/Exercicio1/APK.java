package Exercicio1;

import java.util.Scanner;
import java.lang.Math;

public class APK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Loja  de tinta do z�");
		System.out.println(" qauntos metros quadrados desja pintar?");

		double metros = sc.nextDouble();

		double litros = metros / 3;
		double latas = litros / 18;
		double latasarrend = Math.ceil(latas);
		double pre�o = latasarrend * 80;
		Math.ceil(pre�o);
		System.out.println(" o pre�o � " + pre�o);

		sc.close();
	}

}
