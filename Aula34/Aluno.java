package exercicio;

public class Aluno {
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas;
	private double[][] notasDisciplinas;

	public Aluno() {
		nomeDisciplinas = new String[3];
		notasDisciplinas = new double[3][4];
	}

	public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas, double[][] notasDisciplinas) {
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = nomeDisciplinas;
		this.notasDisciplinas = notasDisciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	public void mostrarNotas() {
		for (int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.println(notasDisciplinas[i][j] + " ");
			}
		}
	}
	
	
	
	
	//public String toString() {
		//StringBuilder retorno = new StringBuilder();
		
		//retorno.append("Nome: ").append(getNome());
		//retorno.append("Matricula: ").append(getMatricula());
		//retorno.append("Nome do curso: ").append(getNomeCurso());
		

}
