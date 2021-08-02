package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getInstrutor() {
		return instrutor;
	}


	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}


	public List<Aula> getAulas() {
		return aulas;
	}

	
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
		                   
	}


	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}


	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	public void matricula(Aluno alunos) {
		this.alunos.add(alunos);
		this.matriculaParaAluno.put(alunos.getNumMatricula(), alunos);
	}
	public void adicionar(Aula aulas) {
		this.aulas.add(aulas);
	}
	public int total() {
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas + "]";
	}


	public boolean estaMatriculado(Aluno aluno) {
		
		return alunos.contains(aluno);
	}


	public Aluno buscarMatriculaAluno(int matricula) {
		
		return matriculaParaAluno.get(matricula);
	}
	
	
	
	
}
