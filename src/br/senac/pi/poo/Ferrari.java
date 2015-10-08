package br.senac.pi.poo;

public class Ferrari {

	public static void main(String[] args) {
		
		//Objeto(instancia) da classe Carro 
		Carro c1 = new Carro();
		
		c1.marca = "Ferrari";  //Atribuição de valores
		c1.modelo = "F448";
		c1.chassi = "F456789FRTY";
		c1.ano = 2015;
		
		System.out.println("Marca: "+ c1.marca);
		System.out.println("Modelo: "+ c1.modelo);
		System.out.println("Ano: "+ c1.ano);
		System.out.println("Chassi: "+ c1.chassi);
		System.out.println(" ");
		c1.partida(); //Chamada ao método
		c1.acelerar();
		c1.freiar();
		
		
	}

}
