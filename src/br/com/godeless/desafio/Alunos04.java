package br.com.godeless.desafio;

import java.util.ArrayList;
import java.util.List;

import br.com.godeless.desafio.model.Aluno;

public class Alunos04 {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("ubuntu1 Silva");
		aluno1.seteNota(6.8);
		aluno1.setIdade(15);
		
		Aluno aluno2 = new Aluno();
		aluno1.setNome("ubuntu2 Oliveira");
		aluno1.seteNota(7.5);
		aluno1.setIdade(17);
	
		Aluno aluno3 = new Aluno();
		aluno1.setNome("ubuntu3 Santos");
		aluno1.seteNota(8.9);
		aluno1.setIdade(16);
		
		Aluno[] alunos = new Aluno[3];
		
		alunos[0]= aluno1;
		alunos[1]= aluno2;
		alunos[2]= aluno3;
		
		double somaNotas= 0d;
		
		for (Aluno aux : alunos ){
			somaNotas= somaNotas + aux.getNota();
		}
		
		System.out.println("MEDIAS DAS NOTAS COM ARRAY: " + somaNotas/3);
		
		List<Aluno> studants = new ArrayList<Aluno>();
		studants.add(aluno1);
		studants.add(aluno2);
		studants.add(aluno3);
		
		somaNotas=0d;
		
		for (Aluno aux : studants ){
			somaNotas= somaNotas + aux.getNota();
		}
		System.out.println("MEDIAS DAS NOTAS COM ARRAYLIST: " + somaNotas/3);
	}
	
}
