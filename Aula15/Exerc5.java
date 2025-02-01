package com.loiane.curso_java_basico.aula15;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();	
		double n2 = sc.nextDouble();
		double media = (n1 + n2) / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		}else if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 7) {
			System.out.println("Reprovado");
		}
	}
}
