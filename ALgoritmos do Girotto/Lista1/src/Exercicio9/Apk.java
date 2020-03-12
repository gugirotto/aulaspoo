package Exercicio9;

import java.util.Scanner;

public class Apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = new int[20];
		boolean alternar = true;

		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 1;
			array2[i] = 99 - i;
		}
		for (int i = 0; i < array3.length; i++) {
			alternar = !alternar;
			if (alternar) {
				array3[i] = array1[i/2];
			}else {
				array3[i] = array2[(i-1)/2];
			}
			
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
			
		}
		sc.close();
	}

}
