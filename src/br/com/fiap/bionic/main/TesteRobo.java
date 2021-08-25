package br.com.fiap.bionic.main;

import br.com.fiap.bionic.models.Robo;

public class TesteRobo {

	public static void main(String[] args) {
		
		Robo robo = new Robo();
		robo.setDefesa(30.0);
		robo.setPeso(30.0);
		robo.setPoderMagico(30.0);
		robo.setVelocidade(30.0);
		
		System.out.println("Defesa: "+robo.getDefesa());
		System.out.println("Peso: "+robo.getPeso());
		System.out.println("Poder Mágico: "+robo.getPoderMagico());
		System.out.println("Velocidade: "+robo.getVelocidade());
		
		robo.andar();
		robo.correr();

	}

}
