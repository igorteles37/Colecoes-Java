package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {
	
	public static void main(String[] args) {
		
		//Nao tem garantia da ordem que eles estão
		//Nao eh possuvel adicionar elementos repetidos
		//Vantagem: Muito mais rápido que o List
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Lopes");
		alunos.add("Mauricio Aniche");
		alunos.add("Mauricio Aniche");
		
		
		
		System.out.println(alunos);
		
	}

}
