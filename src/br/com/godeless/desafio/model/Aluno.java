package br.com.godeless.desafio.model;

public class Aluno {

	private String nome;
	private double nota;
	private int idade;
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome= nome;
	}
	public double getNota(){
		return this.nota;
	}
	public void seteNota(double nota){
		this.nota = nota;
	}
	public int getIdade(){
		return this.idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
}
