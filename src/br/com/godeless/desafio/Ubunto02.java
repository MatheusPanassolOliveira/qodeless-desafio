package br.com.godeless.desafio;

public class Ubunto02 {

	public static void main(String[] args) {
		
		
	System.out.println("UBUNTU 002 - STARTS...");
		
		String nome1 ="Ubuntu1 Silva";
        int idade1 = 33;
        double peso1 = 80.44;
        float altura1 = 1.90f;
        boolean EhDev1 = true;

        String nome2 ="Ubuntu2 Santos";
        int idade2 = 27;
        double peso2 = 89.65;
        float altura2 = 1.91f;
        boolean EhDev2 = true;


        String nome3 ="Ubuntu3 Silva";
        int idade3 = 45;
        double peso3 = 101.89;
        float altura3 = 1.78f;
        boolean EhDev3 = false;
        
        //T1 - somar a idade de todos Ubuntus
        int somaidades = idade1 + idade2 + idade3;
        System.out.println("SOMAS DAS IDADES: " + somaidades);
        
        //T2- Agrupar os nomes  de todos Ubuntus
        String nomes=nome1 +" "+ nome2+" "+ nome3;
        System.out.println("NOMES AGRUPADOS: " + nomes);
        
        //T3-Calcular Média doas IMC de todos Ubuntus
        double imc1 = peso1 / altura1;
        double imc2 = peso2 / altura2;
        double imc3 = peso3 / altura3;
        
        double media = (imc1+imc2+imc3) / 3;
        System.out.println("MEDIA DOS IMC: " + media);
        
        //T4- Contar quantos Ubuntus são Devs
        
        int ehDev = 0;
        if(EhDev1){
        	ehDev = ehDev + 1;
        }
        if(EhDev2){
        	ehDev = ehDev + 1;
        }
        if(EhDev3){
        	ehDev = ehDev + 1;
        }
        System.out.println("NUMEROS DE DEVS: " + ehDev);
        
        //T5-Exibir somente Ubuntu com nome Silva
       String silva = "";
        if(nome1.contains("Silva")){
        	silva += nome1 + " ";
        }
        if(nome2.contains("Silva")){
        	silva += nome2 + " ";
        }
        if(nome3.contains("Silva")){
        	silva += nome3 + " ";
        }
        System.out.println("EXIBIR SOMENTES UBUNTUS COM NOME SILVA: " + silva);
	}
	
}
