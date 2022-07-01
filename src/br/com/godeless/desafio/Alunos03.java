package br.com.godeless.desafio;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.*;

public class Alunos03 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<Aluno>();

        int qtdAlunos = 0;
        System.out.print("Quantidade de alunos: ");
        qtdAlunos = Integer.parseInt(sc.nextLine());

        for (int x = 0; x < qtdAlunos; x++) {


            Aluno aluno = new Aluno();

            System.out.print("Digite o nome: ");
            aluno.nome = sc.nextLine();

            System.out.print("Digite a nota: ");
            aluno.nota = Integer.parseInt(sc.nextLine());

            alunos.add(aluno);
        }

        sc.close();

        Collections.sort(alunos, (a, b) -> a.nota > b.nota ? -1 : a.nota == b.nota ? 0 : 1);

        System.out.print("ALUNO COM MAIOR NOTA: " + alunos.get(0).nome);
    }


}

class Aluno{
    String nome;
    int nota;

}