package com.loiane.curso_java_basico.aula24_labs;

public class Exerc1 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.cor = "Azul";
		lampada.garantia = 12;
		lampada.marca = "Philips";
		lampada.potencia = 12;
		lampada.tipoDeLuz = "led";
		lampada.tipos = new String[5]; //Criando um array, mesmo já ter sido criado
		lampada.tipos[0] = "modelo 1";
		lampada.tipos[1] = "modelo 2";
		lampada.tipos[2] = "modelo 3";

		
		System.out.println("O modelo de lampada é " + lampada.cor);
		System.out.println("A garantia da lampada é " + lampada.garantia);
		System.out.println("A marca da lampada é " + lampada.marca);
		System.out.println("A potência da lampada é " + lampada.potencia);
		System.out.println("O tipo de luz da lampada é " + lampada.tipoDeLuz);		
	}
}
