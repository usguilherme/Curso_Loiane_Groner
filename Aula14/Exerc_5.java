package com.loiane.curso_java_basico.aula14;
import java.util.Scanner;

public class Exerc_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float metros = sc.nextFloat();
		double centimetros = metros * 100;
		
		System.out.printf("%.0f metros em centimetros é %.0f cm", metros, centimetros);

	}

}
