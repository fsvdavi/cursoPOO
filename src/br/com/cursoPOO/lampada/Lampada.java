package br.com.cursoPOO.lampada;

public class Lampada {
	String tipo;
	String formato;
	boolean ligada;
	double preco;
	double potencia;
	  
	  
	void ligar() {
	    ligada = true;
	    System.out.println("A lâmpada foi ligada.");
	  }

	String exibirModelo() {
	    return formato;
	  }

	void alterarPreco(double novoPreco) {
	    preco = novoPreco;
	    System.out.println("O preço foi alterado para: " + novoPreco);
	    
	}
	
	//CONSTRUTORES
	
	Lampada() {
		System.out.println("A classe lâmpada foi instanciada!");
	}
	
	Lampada(String tipo, String formato) {
		this.tipo = tipo;
		this.formato = formato;
		System.out.println("A lâmpada é" + this.tipo + " e tem fomato de " + this.formato);		
	}
	
	Lampada(boolean ligada, double preco, double potencia) {
		this.ligada = ligada;
		this.preco = preco;
		this.potencia = potencia;
			if (this.ligada) {
				System.out.println("A lâmpada está acesa");				
			} else {
				System.out.println("A lâmpada está apagada");
			}
		System.out.println("A lâmpada custa " + this.preco + " R$ e possui uma potência de " + 
		this.potencia + this.potencia);
		
	}
}
