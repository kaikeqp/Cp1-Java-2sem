package br.com.fiap.bionic.main;

import br.com.fiap.bionic.models.Jett;
import br.com.fiap.bionic.models.JettTanker;
import br.com.fiap.bionic.models.Robo;

public class TesteJettTanker {

	public static void main(String[] args) {
		Robo robo = new Robo();
		robo.setDefesa(30.0);
		robo.setPeso(30.0);
		robo.setPoderMagico(30.0);
		robo.setVelocidade(30.0);
		
		Jett rj = new Jett();
		rj.setJato(true);
		rj.setVelocidadeDeVoo(40.0);

		JettTanker rjt = new JettTanker();
		rjt.setVelocidade(robo.getVelocidade());
		rjt.correr();
		rjt.setEspecial(45.0);
		rjt.setPoderMagico(robo.getPoderMagico());
		rjt.cuspirFogo();
	}

}
