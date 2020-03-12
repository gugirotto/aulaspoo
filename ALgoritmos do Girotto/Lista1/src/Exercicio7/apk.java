package Exercicio7;

public class apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anos = 1;
		double poa = 80000;
		double pob = 200000;
		while (poa <= pob) {
			anos++;
			poa *= 1.03;
			pob *= 1.015;
			System.out.println(" dps de " + anos + " anos");
			System.out.println(" pop a é de " + poa);
			System.out.println(" pop b é de " + pob);
			
		}
		System.out.println("a quantidade de anos que precisa é: " + anos);

	}

}
