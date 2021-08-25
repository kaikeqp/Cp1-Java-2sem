package br.com.fiap.bionic.models;

public class Speedster extends Robo{

	private Double aumentoVelocidade;
	private Double turbo;

	public void correr(){
		Double velocSpeedster = super.velocidade + aumentoVelocidade;
		this.velocidade = velocSpeedster + turbo;
		System.out.println("*Correndo*, velocidade: "+velocidade);
	}

	public Double getAumentoVelocidade() {
		return aumentoVelocidade;
	}

	public void setAumentoVelocidade(Double aumentoVelocidade) {
		this.aumentoVelocidade = aumentoVelocidade;
	}

	public Double getTurbo() {
		return turbo;
	}

	public void setTurbo(Double turbo) {
		this.turbo = turbo;
	}
	
	
}
