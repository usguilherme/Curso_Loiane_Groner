//Criando dois vetores, um recebendo seus próprios valores de entrada, e o segundo sendo o dobro de cada valor do anterior.

package com.loiane.curso_java_basico.aula19;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[8];
		int vetorB[] = new int[8];
		
		for (int i = 0; i < vetorA.length; i ++) {
			int entrada = sc.nextInt();
			vetorA[i] = entrada;
			vetorB[i] = entrada * 2;
		}
		
		System.out.println("Mostrando o vetorA");
		
		for (int elemento : vetorA) {
			System.out.println(elemento);
		}
		System.out.println("Mostrando o vetorB");
		for (int elemento1 : vetorB) {
			System.out.println(elemento1);
		
		}
	}
}
