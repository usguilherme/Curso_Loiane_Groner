package com.loiane.curso_java_basico.aula15;

import java.util.Scanner;
public class Exerc4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra = sc.next().toLowerCase();
		if (letra.length() > 1) {
			System.out.println("Letra Inválida");
		}
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": System.out.println("Vogal"); break;
		default: System.out.println("Consoante"); break;
		}	
	}
}
