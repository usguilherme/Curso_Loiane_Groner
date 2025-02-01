package com.loiane.curso_java_basico.aula13;
import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String nome = sc.nextLine();
		String nome2 = sc.nextLine();
	
		if (nome.equals("Guilherme") & nome2.equals("Macario")){
			System.out.println("Tudo certo");
		} else if (nome.equals("Guilherme") && nome2.equals("Macario")){
			System.out.println("Erro");
		} else {
			System.out.println("ERRO");

		}
		
	}

}
