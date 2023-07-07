package br.com.alura;

public class Aluno {
	
	private String nome;
	private int matricula;
	
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public int getMatricula() {
		return matricula;
	}


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.getNome());
		
	}
	
	


}
