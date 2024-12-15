package br.com.cursoPOO.pessoa;

public class Pessoa {
	String nome;
	String sobrenome;
	String emprego;
    int anoNascimento;
    double altura;
    

   
    void exibirInf() {
        System.out.println("Pessoa: " + nome + ", Sobrenome: " + sobrenome + ", Altura: " + altura);
    }

    int obterIdade() {
    	System.out.println("O método obter idade foi acionado");
    	return 2024 - anoNascimento;
   }

    void mudarEmprego(String novoEmprego) {
    	this.emprego = novoEmprego;
        System.out.println("Endereço alterado para " + novoEmprego);
    }
    
    
    //CONSTRUTORES
    
    Pessoa() {
    	System.out.println("A classe pessoa foi instaciada!");
    }
    
    Pessoa(String nome, String sobrenome) {
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    	System.out.println("O nome da pessoa é: " + this.nome + " " + this.sobrenome);  	
    }
    
    Pessoa(int anoNascimento, String emprego) {
    	this.anoNascimento = anoNascimento;
    	this.emprego = emprego;
    	System.out.println("A pessoa trabalha como " + this.emprego + " e nasceu em " + this.anoNascimento);	
    }
    
    
}

