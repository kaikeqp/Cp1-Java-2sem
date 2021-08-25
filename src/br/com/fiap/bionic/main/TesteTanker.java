package br.com.fiap.bionic.main;

import br.com.fiap.bionic.models.Robo;
import br.com.fiap.bionic.models.Tanker;

public class TesteTanker {

	public static void main(String[] args) {
		Robo robo = new Robo();
		robo.setDefesa(30.0);
		robo.setPeso(30.0);
		robo.setPoderMagico(30.0);
		robo.setVelocidade(30.0);

		Tanker rt = new Tanker();
		rt.setAumentoDePeso(20.0);
		rt.setDefesa(robo.getDefesa());
		rt.setArmadura(40.0);
		rt.usarArmadura();
		rt.setAumentoDePeso(15.0);
		rt.setPeso(robo.getPeso());
		System.out.println(rt.peso());
		
	}

}
