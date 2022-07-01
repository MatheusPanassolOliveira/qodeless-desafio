package de.vogella.mysql.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.godeless.desafio.model.Aluno;

public class Desafio6mysql {
	public static void main(String[] args){
		Aluno aluno1 = new Aluno();
		aluno1.setNome("ubuntu1 santos");
		aluno1.seteNota(6.8);
		aluno1.setIdade(15);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("ubuntu2 panassol");
		aluno2.seteNota(7.5);
		aluno2.setIdade(17);

		Aluno aluno3 = new Aluno();
		aluno3.setNome("ubuntu3 menezes");
		aluno3.seteNota(8.9);
		aluno3.setIdade(16);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		String url = "jdbc:mysql://localhost:3306/desafio?useSSL=false";
        String user = "root";
        String password = "root";
        
        String query = "INSERT INTO aluno (nome,idade,nota) VALUES (?,?,?)";

        try{
        	
        	Connection con = DriverManager.getConnection(url, user, password);	
        	PreparedStatement preparedStmt = con.prepareStatement(query);
        	
        	
        	for(Aluno aluno : alunos ){
    	  
        	  preparedStmt.setString (1, aluno.getNome());
        	  preparedStmt.setInt(2, aluno.getIdade());
        	  preparedStmt.setDouble(3, aluno.getNota());
        	  
        	  preparedStmt.execute();
        	  
        	}
        	
        	con.close();
           
        } catch (SQLException ex) {
            
           ex.printStackTrace();
        }
		
	}
}
