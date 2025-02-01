package com.loiane.curso_java_basico.aula15;
import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.next().toLowerCase();
		switch (nome) {
		case "f": System.out.println("f - Feminino"); break;
		case "m": System.out.println("m - Masculino"); break;
		default: System.out.println("Sexo indefinido"); break;
		}
	}
}
