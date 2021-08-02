package br.com.alura;

public class TestaAlunoMatriculado {
	
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionar(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionar(new Aula("Modelando com coleções", 22));

		Aluno a1 = new Aluno("Rodrigo", 1234);
		Aluno a2 = new Aluno("Guilherme", 6456);
		Aluno a3 = new Aluno("Mauricio", 74387);
		//Aluno a4 = new Aluno("Rodrigo", 1234);
		
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Aluno resultado = javaColecoes.buscarMatriculaAluno(6456);
	
		System.out.println("Quem é o aluno com a matrícula: " + resultado);
		
	}
}
