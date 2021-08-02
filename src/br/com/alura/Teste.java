package br.com.alura;

import java.util.ArrayList;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Java", 40);
		Aula aula2 = new Aula("OO", 10);
		Aula aula3 = new Aula("Não sei", 20);
		Curso curso = new Curso("Java Básico", "Paulo Silveira");
		curso.getAulas().add(aula1);
	
		List<Aula> aula = new ArrayList<>();
		aula.add(aula1);
		aula.add(aula2);
		aula.add(aula3);
//	
		
		Aula p = aula.get(0);
		System.out.println(p);
		
		curso.setAulas(aula);
		System.out.println("A soma total : " + curso.total());
		
		
		System.out.println(curso);
		
	}
}