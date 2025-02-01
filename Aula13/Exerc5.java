package com.loiane.curso_java_basico.aula13;
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double metros = sc.nextDouble();
		double cm = metros * 100;
		
	System.out.printf("O valor é de %.0f cm", cm);
	

	}

}
