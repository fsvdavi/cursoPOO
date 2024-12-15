package br.com.cursoPOO.carro;

public class Carro {
	String marca;
	String modelo;
	String placa;
	
	int ano;
	int capacidadePassageiro;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	Carro() {
		System.out.println("A classe carro foi instanciada!");
		capacidadePassageiro = 4;
	}
	
	Carro(String marca, String modelo, String placa, int capacidadePassageiro, 
	double capacidadeCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.capacidadePassageiro = capacidadePassageiro;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;	
	}
	
	Carro(String marca, String modelo, int ano) {
		this.capacidadePassageiro = 5;
		this.marca = marca;
		this.modelo = modelo;
			if (ano > 1885) {
				this.ano = ano;
			  } else {
				  System.out.println("Ano inválido!");
			  }
		
	}
	
	void exibirAutonomia() {
		double autonomia = capacidadeCombustivel * consumoCombustivel;
		System.out.println("A autonomia do veículo é " + autonomia);
	}
	
	double obterAutonomia() {
		System.out.println("O método obter  autonomia foi chamado");
		return capacidadeCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel (double km) {
		double qntCombustivel = km / consumoCombustivel;
		return qntCombustivel;
		
	}
	
	
	
	
	

}
