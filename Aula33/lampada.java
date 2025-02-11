package exercicios;

public class Lampada {
	private String modelo;
	private String tensao;
	private String[] tipos;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private int potencia;
	private boolean tipoAbajur;
	private boolean ligada;
	
	

	public Lampada(String modelo, String tensao, String[] tipos, String cor, String tipoLuz, int garantiaMeses,
			int potencia, boolean tipoAbajur, boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.tipos = tipos;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.potencia = potencia;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}

	public Lampada() {}
	


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isTipoAbajur() {
		return tipoAbajur;
	}

	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public String exibirStatusLampada() {
		String resultado;
		if (isLigada()) {
			resultado = "A lâmpada está ligada";
			return resultado;
		} else {
			resultado = "A lâmpada não está ligada";
			return resultado;

		}
	}
	public String toString() {
		StringBuilder retorno = new StringBuilder();
		
		retorno.append("O modelo da lampada é ").append(getModelo()).append("\n");
		retorno.append("A tensão da lampada é ").append(getTensao()).append("\n");
		retorno.append("A cor da lampada é ").append(getCor()).append("\n");
		retorno.append("O tipo de luz da lampada é ").append(getTensao()).append("\n");
		retorno.append("A potência lampada é ").append(getPotencia()).append("\n");
		retorno.append("Estado da lampada: ").append(exibirStatusLampada()).append("\n");
		return retorno.toString();
		}
	}
