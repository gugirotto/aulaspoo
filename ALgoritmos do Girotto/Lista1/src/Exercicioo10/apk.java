package Exercicioo10;

import java.util.Scanner;

public class apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome;
		String senha;
		boolean ok = true;

		while (ok) {
			System.out.println("digite o nome ");
			nome = sc.next();
			System.out.println("digite a senha");
			senha = sc.next();
			if (nome.equals(senha)) {
				System.out.println("nome = senha digite dnv");
			} else {
				System.out.println("cadastro sucedido");
				ok = false;
				sc.close();
			}

		}
	}

}
