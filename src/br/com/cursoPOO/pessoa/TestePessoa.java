package br.com.cursoPOO.pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		System.out.println(p1);
		p1.nome = "Davi";
		p1.sobrenome = "Viana";
		p1.emprego = "Estudante";
		p1.anoNascimento = 2009;
		p1.altura = 1.76;
		
		Pessoa p2 = new Pessoa();
		System.out.println(p2);
		p2.nome = "Sara";
		p2.sobrenome = "Viana";
		p2.emprego = "Estudante";
		p2.anoNascimento = 2016;
		p2.altura = 1.37;
		
		Pessoa p3 = new Pessoa();
		System.out.println(p3);
		p3.nome = "José";
		p3.sobrenome = "Ribeiro";
		p3.emprego = "Advogado";
		p3.anoNascimento = 1983;
		p3.altura = 1.70;	
	}
	
	

}
