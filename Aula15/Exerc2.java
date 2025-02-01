package com.loiane.curso_java_basico.aula15;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double numero = sc.nextDouble();
		if (numero > 0) {
			System.out.println("O número é positivo");
		} else if (numero == 0) {
			System.out.println("O número é zero");
		} else {
			System.out.println("O número é negativo");
		}
	}
}
