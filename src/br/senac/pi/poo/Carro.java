package br.senac.pi.poo;

//Classe 
public class Carro {
	
	//Atributos
	String marca;
	String modelo;
	int ano;
	String placa;
	String chassi;
	
	//M�todos
	//Executam uma a��o
	public void partida(){
		System.out.println("Carro ligado...");
	}
	
	public void acelerar(){
		System.out.println("Carro acelerado...");
	}
	
	public void freiar(){
		System.out.println("Carro parado...");
	}

}
