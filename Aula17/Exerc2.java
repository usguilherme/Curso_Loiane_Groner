//faça um programa que recebe o nome da pessoa e sua senha, se a senha e o nome forem iguais, peça pra colocar mudar, pois elas não podem ser iguais
package com.loiane.curso_java_basico.aula17;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean iguais = false;
		
		do {
			String nome = sc.next();
			String senha = sc.next();
			
			if (nome.equals(senha)) {
				iguais = true;
				System.out.println("Senha igual ao seu nome, faça outra senha");
			} else {
				iguais = false;
			} 
		} while (iguais == true);
		System.out.println("Programa finalizado");
	}
}
