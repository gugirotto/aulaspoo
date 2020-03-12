package ahshit;

import java.util.Scanner;

public class Apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("digite um numero");
		int conta = 0;
		int lim = sc.nextInt();
int div = 0;
div = (lim*lim)-(6*lim) + 9;
		for (int a=2; a <=lim;a++) {
			
			if (primo(a)) {
				conta++;
			}
		}
		System.out.println("tem " + conta + " numeros primos menores que "+ lim);
		System.out.println(" a quantidade de vezes que o numero foi divido É " + div );
		sc.close();
	}

	public static boolean primo(int a) {

		boolean resultado = true;
		for (int i = 2; i < a; i++) {
			if ((a % i) == 0) {
				resultado = false;
			}
		}
		return resultado;
	}

}
