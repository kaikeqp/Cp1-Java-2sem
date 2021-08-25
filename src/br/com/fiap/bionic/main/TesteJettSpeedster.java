package br.com.fiap.bionic.main;

import br.com.fiap.bionic.models.Jett;
import br.com.fiap.bionic.models.JettSpeedster;
import br.com.fiap.bionic.models.Robo;

public class TesteJettSpeedster {

	public static void main(String[] args) {
		Robo robo = new Robo();
		robo.setDefesa(30.0);
		robo.setPeso(30.0);
		robo.setPoderMagico(30.0);
		robo.setVelocidade(30.0);
		
		Jett rj = new Jett();
		rj.setJato(true);
		rj.setVelocidadeDeVoo(40.0);
		
		JettSpeedster rjs = new JettSpeedster();
		rjs.setJato(rj.isJato());
		rjs.setVelocidadeDeVoo(rj.getVelocidadeDeVoo());
		rjs.voar();
		rjs.voarMaisRapido();

	}

}
