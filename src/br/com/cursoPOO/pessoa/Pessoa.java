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
    
    
}

