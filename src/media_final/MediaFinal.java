package media_final;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		
		System.out.println("---------------------------");
		System.out.println("     ✧ NOTAS FINAIS ! ✧ ");
		System.out.println("---------------------------");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos alunos há na turma?");
		String alunoQuantidade = teclado.next();
		
		System.out.print("Nome do aluno:");
		String nome = teclado.next();
		
		System.out.print("Nota do 1º bimestre:");
		String nota1 = teclado.next();
		
		System.out.print("Nota do 2º bimestre:");
		String nota2 = teclado.next();
		
		System.out.print("Nota do 3º bimestre:");
		String nota3 = teclado.next();
		
		System.out.print("Nota do 4º bimestre:");
		String nota4 = teclado.next();
		
		System.out.println("");
		
		System.out.println("Deseja cadastrar outro aluno? ( 'sim' ou 'não' )");
		String resposta = teclado.next();
		System.out.println("");
		
		int respostaC;
		
		if (resposta.equals("sim")); {
			
			
			
		}
		
		
	}

}
