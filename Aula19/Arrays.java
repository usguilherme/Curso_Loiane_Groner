package com.loiane.curso_java_basico.aula19;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] temperaturas = new double[10];
		
		for (int i =0; i < temperaturas.length; i++) {
			System.out.println("Digite o valor que você quer adicionar ");
			temperaturas[i] = sc.nextDouble();
		}
		
		for (int j = 0; j < temperaturas.length; j++) { //for índice, j
			System.out.println(temperaturas[j]);
		}
		for (double elemento : temperaturas) {
			System.out.println(elemento);  //For elemento
		}
	}

}
