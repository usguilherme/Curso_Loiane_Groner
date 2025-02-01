package com.loiane.curso_java_basico.aula13;
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("O resultado da média é %.1f", media);
		
		

	}

}
