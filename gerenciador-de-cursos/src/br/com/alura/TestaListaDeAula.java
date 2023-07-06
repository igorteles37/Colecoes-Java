package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("A - Revisitando as Arraylista", 21);
		Aula a2 = new Aula("C - Listas De objetos", 19);
		Aula a3 = new Aula("B - Relacionamento de listas e objetos", 15);
		
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		
		System.out.println(aulas);
		
		
		//ASC
		//Collections.sort(aulas);
		
		//DESC
		Collections.sort(aulas, Collections.reverseOrder());
		
		
			
		/*aulas.forEach(a -> {
			
			System.out.println(a.getTitulo() + " - " +  a.getTempo());
			
		});*/
		
		
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		//aulas.sort(Comparator.comparing(Aula::getTempo));
		aulas.sort(Comparator.comparing(Aula::getTempo, Collections.reverseOrder()));
		
		aulas.forEach(a -> {
			
			System.out.println(a.getTitulo() + " - " +  a.getTempo());
			
		});
		
	}

}
