package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do Aluno: ");
		String nome = sc.nextLine();
		
		System.out.print("Motivo da Anotação: ");
		String motivo = sc.nextLine();
		
		System.out.print("Série e Turma do Aluno: ");
		int serie = sc.nextInt();
		String turma = sc.nextLine();
		
		System.out.println("");
		System.out.println("Salve os dados a seguir: ");
		
		System.out.println("Nome do Aluno: " + nome);
		System.out.println("Motivo pelo qual foi Anotado: " + motivo);
		System.out.println("Série e turma: " + serie + turma);
		
		sc.close();
	}

}
