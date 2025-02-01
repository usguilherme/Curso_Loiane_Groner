package com.loiane.curso_java_basico.aula14;
import java.util.Scanner;

public class Soma_Dos_Numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois números, que iremos soma-lós");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		
		System.out.printf("A soma do numero %d e do numero %d é %d",n1,n2,soma);
		
	}
}
