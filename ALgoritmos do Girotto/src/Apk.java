
public class Apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("kleber", 10);
		Aluno a2 = new Aluno("Jefferson", 7);
		Aluno a3 = new Aluno("Jotaro", 5);
		Aluno a4 = new Aluno("Chaccca", 8);
		Aluno a5 = new Aluno("keer", 1);
		Aluno a6 = new Aluno("eber", 9);
		Aluno a7 = new Aluno("sass", 3);
		Aluno a8 = new Aluno("kloa", 8);
		Aluno a9 = new Aluno("eeee", 6);
		Aluno a10 = new Aluno("cuuc", 2);

		Aluno[] vetor = new Aluno[10];

		vetor[0] = a1;
		vetor[1] = a2;
		vetor[2] = a3;
		vetor[3] = a4;
		vetor[4] = a5;
		vetor[5] = a6;
		vetor[6] = a7;
		vetor[7] = a8;
		vetor[8] = a9;
		vetor[9] = a10;

		int i = 0;

		for (i = 0; i <= vetor.length; i++) {
			if (vetor[i].nota >= 7) {
				System.out.println(vetor[i].nome + " foi aprovado com uma média de " + vetor[i].nota);
			}
		}
	}
}
