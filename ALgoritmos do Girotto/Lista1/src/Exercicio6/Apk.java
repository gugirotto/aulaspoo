package Exercicio6;

import java.util.Scanner;

public class Apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int mat[]= new int [5];

		for (i = 0; i < 5; i++) {
			System.out.println("digite um numero");
			mat[i] = sc.nextInt();
		}
		int maior= 0;
		for (int p=0;p<mat.length;p++){
		   if (mat[p]>maior) {
			   maior=mat[p];
			   }
		}
		System.out.println("o maior valor é " + maior);
		sc.close();

	}

}
