package br.com.fiap.bionic.models;

public class JettTanker extends Jett{

	private Double especial;

	@Override
	public void correr() {
		Double velocJettTanker = super.velocidade - 20.0;;
		System.out.println("*Correndo*, velocidade: "+velocJettTanker);
	}
	
	public void cuspirFogo(){
		Double danoFogo = this.especial + super.poderMagico;
		System.out.println("*Cuspindo Fogo*. Dano: "+ danoFogo);
	}

	public Double getEspecial() {
		return especial;
	}

	public void setEspecial(Double especial) {
		this.especial = especial;
	}
	
	
}
