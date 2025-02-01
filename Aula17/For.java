package com.loiane.curso_java_basico.aula17;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome1 = sc.next();
		String nome2 = sc.next();
		
		int i = 0;
		int max = 10;
		while (i < max) {
			System.out.printf("Bom dia %s, %s tá te mandando um beijo, ele espera que você tenha dormido bem S2\n", nome2, nome1);
				
		}		
	}
}
