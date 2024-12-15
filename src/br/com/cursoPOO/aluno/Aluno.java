package br.com.cursoPOO.aluno;

public class Aluno {
	 String nome;
	 String matricula;
	 String curso;
	 double notaFinal;
	 int idade;


	void exibirDados() {
	    System.out.println("Aluno: " + nome + ", Curso: " + curso);
	 }

	boolean aprovado() {
		return notaFinal >= 6.0;
	 }

	void atualizarNota(double novaNota) {
	    notaFinal = novaNota;
	    System.out.println("A nota foi alterada com êxito");
	    }
	
	//CONSTRUTORES
	
	 Aluno() {
	     System.out.println("A classe aluno foi instaciada!");
	    }
	 
	 Aluno(String nome, int idade) {
		 this.nome = nome;
		 this.idade = idade; 
	 }
	 
	 Aluno(String curso, double notaFinal) {
		 this.curso = curso;
		 this.notaFinal = notaFinal; 
		 	if (this.notaFinal >= 6.0) {
		 		System.out.println("Parabéns, você foi aprovado!");		 		
		 	} else {
		 		System.out.println("Você foi reprovado!");
		 	}
	 }
	 
	}

