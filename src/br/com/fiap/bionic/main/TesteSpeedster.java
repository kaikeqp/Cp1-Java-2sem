package br.com.fiap.bionic.main;

import br.com.fiap.bionic.models.Robo;
import br.com.fiap.bionic.models.Speedster;

public class TesteSpeedster {

	public static void main(String[] args) {
		
		Robo robo = new Robo();
		robo.setDefesa(30.0);
		robo.setPeso(30.0);
		robo.setPoderMagico(30.0);
		robo.setVelocidade(30.0);
		
		Speedster rs = new Speedster();
		rs.setVelocidade(robo.getVelocidade());
		rs.setAumentoVelocidade(15.0);
		rs.setTurbo(10.0);
		rs.correr();
		
	}
}
