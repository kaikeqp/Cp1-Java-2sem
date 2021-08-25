package br.com.fiap.bionic.models;

public class Jett extends Robo{

	protected boolean jato;
	protected Double velocidadeDeVoo;
	
	public void voar(){
		if(jato == true){
			System.out.println("*Voando*. velocidade de voo: "+velocidadeDeVoo);
		}else{
			System.out.println("Jato está desabilitado");

		}
	}


	public boolean isJato() {
		return jato;
	}

	public void setJato(boolean jato) {
		this.jato = jato;
	}

	public Double getVelocidadeDeVoo() {
		return velocidadeDeVoo;
	}

	public void setVelocidadeDeVoo(Double velocidadeDeVoo) {
		this.velocidadeDeVoo = velocidadeDeVoo;
	}
	
	
	
}
