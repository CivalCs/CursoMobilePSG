package br.senac.pi.exercicio1;
import java.util.Scanner;

public class MediaSalario {

	private static Scanner inpt;

	public static void main(String[] args) {
		inpt = new Scanner(System.in);
		
		double sfunc;
		int qfunc;
		double soma = 0;
		
		System.out.println("Informe a quantidade de funcion�rios:");
		qfunc = inpt.nextInt();
		
		for(int i = 1; i <= qfunc; i++){
			System.out.println("Sal�rio do funcion�rio " + i);
			sfunc=inpt.nextDouble();
			soma += sfunc;
		}
		
		double media = soma/qfunc;
		System.out.println("A m�dia de sal�rios �: " + media);
		inpt.close();
	}
	
}
