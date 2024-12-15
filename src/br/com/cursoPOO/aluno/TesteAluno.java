package br.com.cursoPOO.aluno;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
			a1.nome = "João";
	    	a1.matricula = "2021201125";
	    	a1.curso = "Informática";
	    	a1.notaFinal = 6.3;
	    	a1.idade = 17;
	    	
	    	
	    
	    Aluno a2 = new Aluno();
			a2.nome = "Jamile";
			a2.matricula = "2023201106";
			a2.curso = "Edificações";
			a2.notaFinal = 9.3;
			a2.idade = 16;
	    
	    Aluno a3 = new Aluno();
	  		a3.nome = "Caio";
	  	    a3.matricula = "2022201117";
	  	    a3.curso = "Química";
	  	    a3.notaFinal = 4.8;
	  	    a3.idade = 16;
			
	  	  System.out.println("O nome do aluno é: " + a3.nome);


	}

}
