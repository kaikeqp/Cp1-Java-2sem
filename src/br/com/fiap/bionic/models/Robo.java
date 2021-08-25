package br.com.fiap.bionic.models;

public class Robo {

	protected Double peso;
	protected Double velocidade;
	protected Double poderMagico;
	protected Double defesa;
	
	public Double peso(){
		return peso;
	}
	
	public void correr(){
		
		System.out.println("*Correndo*, velocidade: "+velocidade);
	}
	
	public void andar(){
		Double andar = this.velocidade - 20.0;
		System.out.println("*Andando*, velocidade: "+andar);
	}
	

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPoderMagico() {
		return poderMagico;
	}

	public void setPoderMagico(Double poderMagico) {
		this.poderMagico = poderMagico;
	}

	public Double getDefesa() {
		return defesa;
	}

	public void setDefesa(Double defesa) {
		this.defesa = defesa;
	}
	
	
	

	
}
