package br.edu.eteczl.escolabackend.model;

public abstract class Pessoa {
	
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public abstract String falar();
		
}
  