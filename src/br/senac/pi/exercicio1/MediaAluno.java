package br.senac.pi.exercicio1;
import java.util.Scanner;

public class MediaAluno {
	
	private static Scanner inpt;
	
	public static void main(String[] args) {
		inpt = new Scanner(System.in);
		
		double nota;
		double nota1;
		double nota2;
		String nome;
		
		System.out.println("Informe nome do aluno:");
		nome=inpt.next();
		System.out.println("Informe as 3 notas do aluno:");
		nota=inpt.nextDouble();
		nota1=inpt.nextDouble();
		nota2=inpt.nextDouble();
		double media = (nota + nota1 + nota2)/3;
		if(media >= 7){
			System.out.println("Aluno: "+nome);
			System.out.println("Nota 1: "+nota);
			System.out.println("Nota 2: "+nota1);
			System.out.println("Nota 3: "+nota2);
			System.out.println("Média: "+media);
			System.out.println("Aprovado");
		}else{
			if(media >=6 && media <=7){
				System.out.println("Aluno: "+nome);
				System.out.println("Nota 1: "+nota);
				System.out.println("Nota 2: "+nota1);
				System.out.println("Nota 3: "+nota2);
				System.out.println("Média: "+media);
				System.out.println("Recuperação");
			}else{
				if(media < 6){
					System.out.println("Aluno: "+nome);
					System.out.println("Nota 1: "+nota);
					System.out.println("Nota 2: "+nota1);
					System.out.println("Nota 3: "+nota2);
					System.out.println("Média: "+media);
					System.out.println("Reprovado");
				}
			}
		}
		inpt.close();	
	}

}
