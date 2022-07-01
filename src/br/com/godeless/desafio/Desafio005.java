package br.com.godeless.desafio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.godeless.desafio.model.Aluno;

public class Desafio005 {

	public static void main(String[] args) {

	Aluno aluno1 = new Aluno();
	aluno1.setNome("ubuntu1 Silva");
	aluno1.seteNota(6.8);
	aluno1.setIdade(15);
	
	Aluno aluno2 = new Aluno();
	aluno2.setNome("ubuntu2 Oliveira");
	aluno2.seteNota(7.5);
	aluno2.setIdade(17);

	Aluno aluno3 = new Aluno();
	aluno2.setNome("ubuntu3 Santos");
	aluno2.seteNota(8.9);
	aluno2.setIdade(16);
	
	List<Aluno> alunos = new ArrayList<Aluno>();

	alunos.add(aluno1);
	alunos.add(aluno2);
	alunos.add(aluno3);
	
	try {
	      
		File file= new File("C:\\Users\\gpana\\Documents\\workspace\\DesafioJava\\file\\notas.csv");
		file.createNewFile();
		
		FileWriter myWriter = new FileWriter(file);	      
	   
		myWriter.write("nome;nota;idade");
		
		for (Aluno aluno : alunos ){
			myWriter.write(aluno.getNome()+" "+aluno.getNota()+" "+aluno.getIdade());
			myWriter.write(System.getProperty( "line.separator" ));
		}
		
		// myWriter.write("nome;nota;idade");
	     // myWriter.write(System.getProperty( "line.separator" ));
	     // myWriter.write("matheus;10;27");
	      	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	
}
}
