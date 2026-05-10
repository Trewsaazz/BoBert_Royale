package Personajes;

import java.util.Random;

import Estrategia.EstrategiaDefensiva;

public class HechiceroMedieval extends Enemigo{

	public HechiceroMedieval(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaDefensiva();
	}

	@Override
	public void habilidad() {
		
		Random r = new Random();
		System.out.println("Has usado el hechizo de fuego");
		if((r.nextInt(5) +1) != 1) {
			
			System.out.println("El enemigo se ha quemado");
		}else {
			
			System.out.println("Has fallado, apunta mejor");
		}
		
	}
}
