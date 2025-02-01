package com.loiane.curso_java_basico.aula10;

public class Formatacao {

	public static void main(String[] args) {
		String nome = "Guilherme";
		String sobrenome = "Macario";
		float idade = 18;
		double altura = 1.89;
		
		System.out.printf("O meu nome é %s e meu sobrenome é %s, eu tenho %.1f anos de idade e tenho %.1f cm de altura", nome,sobrenome,idade,altura);
	}

}
