package com.loiane.curso_java_basico.aula15;
import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p1 = sc.nextDouble();
		double p2 = sc.nextDouble();
		double p3 = sc.nextDouble();
		
		if (p1 < p2 && p2 < p3) {
			System.out.println("A melhor compra é Primeira");
		} else if (p2 < p1 && p2 < p3) {
			System.out.println("A melhor compra é Segunda");
		} else {
			System.out.println("A melhor compra é Terceira");
		}
	}
}
