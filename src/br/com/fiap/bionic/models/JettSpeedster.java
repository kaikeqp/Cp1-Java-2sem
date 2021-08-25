package br.com.fiap.bionic.models;

public class JettSpeedster extends Jett{

	@Override
	public void voar() {
		Double velocJSpeedster = this.velocidadeDeVoo;
		System.out.println("*Voando*. velocidade de voo: "+velocJSpeedster);
	}

	public void voarMaisRapido(){
		Double vooMaisRapido = this.velocidadeDeVoo + 10.0;;
		System.out.println("*Voando*. velocidade de voo mais rápida: "+vooMaisRapido);
	}
	
}
