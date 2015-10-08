package br.senac.pi.exercicio1;
import java.util.Scanner;

public class BonusFuncionario {
	private static Scanner inpt;
	
	public static void main(String[] args) {
		inpt = new Scanner(System.in);
		
		double sgerente;
		double scoord;
		double ssuper;
		
		System.out.println("Informe o salário do Gerente:");
		sgerente=inpt.nextDouble();
		System.out.println("Informe o salário do Coordenador:");
		scoord=inpt.nextDouble();
		System.out.println("Informe o salário do Supervisor:");
		ssuper=inpt.nextDouble();
		
		double bonusg = (sgerente*15)/100;
		double bonusc = (scoord*10)/100;
		double bonuss = (ssuper*8)/100;
		
		System.out.println("Bonus Gerente: "+bonusg);
		System.out.println("Bonus Coordenador: "+bonusc);
		System.out.println("Bonus Supervisor: "+bonuss);
		
		System.out.println("Sálario total Gerente com bonus: "+ (bonusg + sgerente));
		System.out.println("Sálario total Coordenador com bonus: "+(bonusc + scoord));
		System.out.println("Sálario total Supervisor com bonus: "+(bonuss + ssuper));
		
		inpt.close();		
		
	}
	
}
