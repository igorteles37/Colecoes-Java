package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trablhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		aulas.remove(0);

		
		aulas.add("Aumentando nosso conhecimento");
		
		for (String aula : aulas) {

			System.out.println(aula);

		}

		
		System.out.println("------Ordenado------");
		
			
		
		Collections.sort(aulas);
		
		
		aulas.forEach(a -> {

			System.out.println(a);

		});
		
	}

}
