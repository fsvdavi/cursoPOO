package br.com.cursoPOO.carro;

public class Carro {
	String marca;
	String modelo;
	String placa;
	
	int capacidadePassageiro;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
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
