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
}
