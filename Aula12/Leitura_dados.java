package com.loiane.curso_java_basico.aula12;

import java.util.Scanner;

public class Leitura_dados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome completo ");
		String nomeCompleto = sc.nextLine();
		System.out.println("Digite a sua idade ");
		int idade = sc.nextInt();
		System.out.printf("O seu nome completo é %s, e sua idade é %d anos",nomeCompleto, idade);
		
		
		
		
		
	}

}
