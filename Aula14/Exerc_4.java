package com.loiane.curso_java_basico.aula14;
import java.util.Scanner;

public class Exerc_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A média bimestral é %.2f ",media);
		

	}

}
