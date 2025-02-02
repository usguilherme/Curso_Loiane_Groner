//Criar um vetor A com 15 elementos inteiros. Consturir um vetor B de mesmo tamanho, 
//sendo que cada elemento do vetor B deverá ser a raiz quadrado do respectivo elemento de A

package com.loiane.curso_java_basico.aula19;
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[15];
		double vetorB[] = new double[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i]= sc.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		for (int elemento : vetorA) {
			System.out.println(elemento);
		}
		
		for (double elemento1 : vetorB) {
			System.out.println(elemento1);
		}	
	}		
}
