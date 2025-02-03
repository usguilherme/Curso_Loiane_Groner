package com.loiane.curso_java_basico.aula25;

public class Carro {
	String marca;
	String modelo;
	int numeroDePassageiros;
	double consumoDeCombustivel;
	double quantLitrosNoTanque;
	
	void exibirDurabilidadeDoCarro() {
		System.out.println("A durabilidade de consumo do carro é " + quantLitrosNoTanque * consumoDeCombustivel );
	}
}
