package br.com.alura;

import java.util.Set;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Colecoes do Java", 
				"Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhado com Array", 21));
		javaColecoes.adiciona(new Aula("C -Trabalhado com Array", 21));
		javaColecoes.adiciona(new Aula("B - Criadno uma Aula", 20));
		javaColecoes.adiciona(new Aula("A - Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turine", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		alunos.forEach(a -> {
			System.out.println(a);
			});
		
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno a4 = new Aluno("Rodrigo Turine", 34672);
		
		System.out.println(javaColecoes.estaMatriculado(a4));
		
		System.out.println(a1.hashCode() == a4.hashCode());
	}

}
