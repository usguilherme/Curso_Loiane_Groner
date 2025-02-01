package com.loiane.curso_java_basico.aula15;
import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			System.out.printf("O maior número é %.0f", n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.printf("O maior número é %.0f", n2);
		} else if (n3 > n1 && n3 > n2) {
			System.out.printf("O maior número é %.0f", n3);
		}
	}
}
