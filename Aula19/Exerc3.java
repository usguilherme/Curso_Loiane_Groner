//Criando dois vetores, um recebendo seus próprios valores de entrada, e o segundo sendo o primeiro ao quadrado.

package com.loiane.curso_java_basico.aula19;
import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[15];
		int vetorB[] = new int[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			int entrada = sc.nextInt();
			vetorA[i] = entrada;
			vetorB[i] = entrada * entrada;
		}
		
		System.out.println("Mostrando o vetorA");
		
		for (double entrada : vetorA) {
			System.out.println(entrada);	
		}
		for (double entrada2 : vetorB) {
			System.out.println(entrada2);	
		}
	}
}
