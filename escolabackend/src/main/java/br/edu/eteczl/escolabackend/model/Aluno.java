package br.edu.eteczl.escolabackend.model;

public class Aluno extends Pessoa implements IAluno {
	
	public Aluno (String nome) {
		super(nome);
	}

	@Override
	public String falar() {
		return "falando...";
				}

}
