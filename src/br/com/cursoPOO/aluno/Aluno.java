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
	}

