package br.senac.pi;

public class EscopoDeVariavel {

	public static void main(String[] args) {
		//Bloco 1
		int i = 5; //Variavel do bloco 1
		{ // Bloco 2
			int j = 0; //Variavel do bloco 2
			//Uso do i dentro do seu escopo
			System.out.println(i);
			j = 5 * i;
			System.out.println(j);				
		}
		{//Bloco 3
			//Uso do i dentro do seu escopo
			System.out.println(i);
			//ERRO! Uso do j fora do seu escopo 
			//System.out.println(j);
		}
	     //Uso do i dentro do seu escopo
		System.out.println(i) ;
		//ERRO! Uso do j fora do seu escopo
		//System.out.println(j);
		
	
		}
}