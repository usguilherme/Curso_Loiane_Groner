package com.loiane.curso_java_basico.aula15;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.printf("O maior dos dois números digitados foi %.0f", n1);
		} else if (n1 < n2) {
			System.out.printf("O maior dos dois números digitados foi %.0f", n2);			
		} else {
			System.out.println("O dois números são iguais");
			
		}
	}
}
