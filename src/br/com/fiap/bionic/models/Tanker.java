package br.com.fiap.bionic.models;

public class Tanker extends Robo{

	private Double aumentoDePeso;
	private Double armadura;
	
	
	@Override
	public Double peso() {
		Double pesoTanker = super.peso + this.aumentoDePeso;
		return pesoTanker;
	}
	
	public void usarArmadura(){
		Double defesaArmadura = super.defesa + this.armadura;
		System.out.println("Armadura colocada. Aumento de: "+this.armadura+" | Defesa total:"+defesaArmadura);
	}
	
	
	
	public Double getAumentoDePeso() {
		return aumentoDePeso;
	}
	public void setAumentoDePeso(Double aumentoDePeso) {
		this.aumentoDePeso = aumentoDePeso;
	}
	public Double getArmadura() {
		return armadura;
	}
	public void setArmadura(Double armadura) {
		this.armadura = armadura;
	}
	
	
	
}
