package com.loiane.curso_java_basico.aula13;
import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1 = sc.nextInt();
		float n2 = sc.nextInt();
		float soma = n1 + n2;
		
		System.out.printf("O resultado da soma entre os dois números é %.1f", soma);
		
	}

}
