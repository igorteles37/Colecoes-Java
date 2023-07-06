package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as Colecoes do Java", 
				"Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhado com Array", 21));
		javaColecoes.adiciona(new Aula("C -Trabalhado com Array", 21));
		javaColecoes.adiciona(new Aula("B - Criadno uma Aula", 20));
		javaColecoes.adiciona(new Aula("A - Modelando com coleções", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println("Aulas ordenadas");
		
		System.out.println(aulas);
		
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		

	}

}
