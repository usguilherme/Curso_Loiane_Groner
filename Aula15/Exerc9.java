package com.loiane.curso_java_basico.aula15;
import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
	    double n2 = sc.nextDouble();
	    double n3 = sc.nextDouble();
	    
	    if (n1 >= n2 && n1 >= n3) {
	    	if (n2 > n3) {
	    		System.out.printf("Em ordem crescente %.0f, %.0f, %.0f", n3,n2,n1);
	    	} else {
	    		System.out.printf("Em ordem crescente %.0f, %.0f, %.0f", n3,n1,n2);
	    	}
	    } else if (n2 >= n1 && n2 >= n3) {
	    	if (n1 > n3) {
	    		System.out.printf("Em ordem crescente %.0f, %.0f, %.0f", n2,n1,n2);
	    	} else {
	    		System.out.printf("Em ordem crescente %.0f, %.0f, %.0f", n1,n3,n2);
	    	}
	    } else {
	    	if (n2 > n1) {
	    		System.out.printf("Em ordem crescente %.0f, %.0f, %.0f", n1,n2,n3);
	    	} else {
	    		System.out.printf("Em ordem crescente %.0f, %.0f, %.0f", n2,n1,n3);
	    	}
	    }
	}
}
