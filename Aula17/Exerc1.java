//faça um programa que receberá uma nota de um aluno na escola, só irá aceitar essa nota caso ela mesmo estiver entre 0 a 10, caso contrário, irá imprimir uma mensagem
//de "Nota inválida, digite novamente"

package com.loiane.curso_java_basico.aula17;
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean notaValida = false;
		do {
			double nota = sc.nextDouble();
			if (nota >= 0 && nota <= 10){
				notaValida = true;
				System.out.printf("Você digitou %.0f", nota);	
			} else {
				System.out.println("Nota inválida, digite novamente");
			}
			
		} while(!notaValida); 
			
	}
}
