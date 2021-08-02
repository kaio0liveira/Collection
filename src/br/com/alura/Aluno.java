package br.com.alura;

public class Aluno implements Comparable{
	
	private String nome;
	private int numMatricula;

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.numMatricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numMatricula=" + numMatricula + "]";
	}

	@Override
	public int hashCode() {
		
		return nome.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numMatricula != other.numMatricula)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		Aluno aluno = (Aluno) o;
		
		
		return this.nome.compareTo(aluno.getNome());
	} 
	
	
	
	
}
