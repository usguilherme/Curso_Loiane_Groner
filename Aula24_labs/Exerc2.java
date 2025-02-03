package com.loiane.curso_java_basico.aula24_labs;

public class Exerc2 {

	public static void main(String[] args) {
		Livro livro = new Livro(); //Criei meu objeto livro
		livro.nome = "O diário de um banana";
		livro.autor = "Jeff Kinney";
		livro.quantDePaginas = 224;
		livro.anoDeLancamento = 2009;
		
		System.out.println("O nome do livro é " + livro.nome);
		System.out.println("O autor do livro " + livro.nome + " é " + livro.autor);
		System.out.println("O livro tem " + livro.quantDePaginas + " paginas");
		System.out.println("O livro foi lançado em " + livro.anoDeLancamento);
		
	}
}
