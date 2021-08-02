package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestaAluno {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	List<Aluno> aluno = new ArrayList<>();
	Aluno a1 = new Aluno("C",2121);
	Aluno a2 = new Aluno("W",2121);
	Aluno a3 = new Aluno("A",2121);
	
	aluno.add(a1);
	aluno.add(a2);
	aluno.add(a3);
	
	Collections.sort(aluno);
	System.out.println(aluno);
	
	Iterator<Aluno> alunoIterator = aluno.iterator();
	
	while(alunoIterator.hasNext()) {
		Aluno proximo = alunoIterator.next();
		System.out.println(alunoIterator);
	}
	
	
	
}
}
