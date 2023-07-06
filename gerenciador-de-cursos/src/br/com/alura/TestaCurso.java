package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Colecoes", 
				"Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhado com Array", 21));
		javaColecoes.adiciona(new Aula("Trabalhado com Array", 21));
		javaColecoes.adiciona(new Aula("Criadno uma Aulay", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		
		System.out.println(javaColecoes.getAulas());
		
		
	}
}
