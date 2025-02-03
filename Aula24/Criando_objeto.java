package com.loiane.curso_java_basico.aula24;

public class Criando_objeto {

	public static void main(String[] args) {
		Carro sandero = new Carro();
		sandero.marca = "Renault";
		sandero.modelo = "hybrido";
		sandero.numeroDePassageiros = 5;
		sandero.consumoDeCombustivel = 11.5;
		
		System.out.println(sandero.marca);
		System.out.println(sandero.modelo);
		System.out.println(sandero.numeroDePassageiros);
		System.out.println(sandero.consumoDeCombustivel);
		
	}
}
