package br.senac.pi.exercicio1;
import java.util.Scanner;

public class MediaSalario {

	private static Scanner inpt;

	public static void main(String[] args) {
		inpt = new Scanner(System.in);
		
		double sfunc;
		int qfunc;
		double soma = 0;
		
		System.out.println("Informe a quantidade de funcionários:");
		qfunc = inpt.nextInt();
		
		for(int i = 1; i <= qfunc; i++){
			System.out.println("Salário do funcionário " + i);
			sfunc=inpt.nextDouble();
			soma += sfunc;
		}
		
		double media = soma/qfunc;
		System.out.println("A média de salários é: " + media);
		inpt.close();
	}
	
}
