package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaAlucomCurso {
	
public static void main(String[] args) {
	Curso javaColecoes = new Curso("Dominando as coleções do Java",
            "Paulo Silveira");

    javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 21));
    javaColecoes.adicionar(new Aula("Criando uma Aula", 20));
    javaColecoes.adicionar(new Aula("Modelando com coleções", 22));
    
    Aluno a1 = new Aluno("Rodrigo", 1234);
    Aluno a2 = new Aluno("Guilherme", 6456);
    Aluno a3 = new Aluno("Mauricio", 74387);
    Aluno a4 = new Aluno("Rodrigo", 1234);
    
    javaColecoes.matricula(a1);
    javaColecoes.matricula(a2);
    javaColecoes.matricula(a3);
    
    
    //javaColecoes.getAlunos().forEach(a -> System.out.println(a.getNome()));
    
    Set<String> nomes = Collections.emptySet();
    //nomes.add("Paulo"); //o que acontece aqui?
    //System.out.println(nomes);
    
    System.out.println(a1.equals(a4));
    
    System.out.println(a1.hashCode() == a4.hashCode());
    
   // System.out.println(javaColecoes.estaMatriculado(a4));
   
    
    
}

}
