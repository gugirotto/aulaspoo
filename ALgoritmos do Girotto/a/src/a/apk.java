package a;

import java.util.Scanner;

public class apk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Computado c1 = new Computado("carangueijo", "intel pentium", -3, 10000);
		Computado c2 = new Computado("kleber", "nvida amd 709243", 733, 40);
		Computado c3 = new Computado("aeo", "um", 60, 3500);
		Computado c4 = new Computado("TERRORISTA", "intel pentium", 41, 1);
		Computado c5 = new Computado("jea", "itium", 3, 00);
		Computado[] vetor = new Computado[5];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = new Computado();

		}
		int capDisco = 0, capMem = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("passe o modelo do pc " + (i + 1));
			vetor[i].setModelo(sc.next());
			System.out.println("passe o processador do pc " + (i + 1));
			vetor[i].setProcessador(sc.next());
			System.out.println("passe a memoria do pc " + (i + 1));
			vetor[i].setMemoria(sc.nextInt());
			capMem += vetor[i].getMemoria();
			System.out.println("passe o disco do pc " + (i + 1));
			vetor[i].setDisco(sc.nextInt());
			capDisco += vetor[i].getDisco();
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("modelo do pc " + (i + 1) + " :");
			System.out.println(vetor[i].getModelo());
			System.out.println("processador do pc " + (i + 1) + " :");
			System.out.println(vetor[i].getProcessador());
			System.out.println("memoria do pc " + (i + 1) + " :");
			System.out.println(vetor[i].getMemoria());
			System.out.println("disco do pc " + (i + 1) + " :");
			System.out.println(vetor[i].getDisco());
		}
		System.out.println("a memoria total é: " +capMem);
		System.out.println("o disco total é: " +capDisco);

		/*
		 * System.out.println("digite o modelo"); c1.setModelo(sc.next());
		 * System.out.println("digite o processaodr"); c1.setProcessador(sc.next());
		 * System.out.println("digite a memoria "); c1.setMemoria(sc.nextInt());
		 * System.out.println("digite o disco"); c1.setDisco(sc.nextInt());
		 * 
		 * System.out.println(c1.getModelo()); System.out.println(c1.getProcessador());
		 * System.out.println(c1.getMemoria()); System.out.println(c1.getDisco());
		 * 
		 * System.out.println(c2.getModelo()); System.out.println(c2.getProcessador());
		 * System.out.println(c2.getMemoria()); System.out.println(c2.getDisco());
		 * 
		 * System.out.println(c3.getModelo()); System.out.println(c3.getProcessador());
		 * System.out.println(c3.getMemoria()); System.out.println(c3.getDisco());
		 * 
		 * System.out.println(c4.getModelo()); System.out.println(c4.getProcessador());
		 * System.out.println(c4.getMemoria()); System.out.println(c4.getDisco());
		 * 
		 * System.out.println(c5.getModelo()); System.out.println(c5.getProcessador());
		 * System.out.println(c5.getMemoria()); System.out.println(c5.getDisco());
		 */

	}

}
