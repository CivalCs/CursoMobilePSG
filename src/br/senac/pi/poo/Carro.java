package br.senac.pi.poo;

//Classe 
public class Carro {
	
	//Atributos
	String marca;
	String modelo;
	int ano;
	String placa;
	String chassi;
	
	//Métodos
	//Executam uma ação
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
