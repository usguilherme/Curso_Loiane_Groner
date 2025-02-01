package com.loiane.curso_java_basico.aula15;
import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			System.out.printf("O maior número é %.0f\n", n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.printf("O maior número é %.0f\n", n2);
		} else {
			System.out.printf("O maior número é %.0f\n", n3);
		}
	
		if (n1 <= n2 && n1 <= n3) {
			System.out.printf("O menor número é %.0f\n", n1);
		} else if (n2 <= n1 && n2 <= n3) {
			System.out.printf("O menor número é %.0f\n", n2);
		} else {
			System.out.printf("O menor número é %.0f\n", n3);
		}	
	}	
}
