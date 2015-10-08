package br.senac.pi.exercicio1;
//import java.util.Scanner;

public class Impares {
	//private static Scanner inpt;

	public static void main(String[] args) {
		//inpt = new Scanner(System.in);
		
		int i;		
		System.out.println("Números impares entre 0 e 100: ");
		for(i=0;i<=100;i++){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
		
	}

}
