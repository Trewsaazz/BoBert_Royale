package Personajes;

import Estrategia.EstrategiaEquilibrada;

public class GuerreroMedieval extends Enemigo{
	
	public GuerreroMedieval(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaEquilibrada();
	}

	@Override
	public void habilidad() {
		
		System.out.println("Has usado la espada de acero para atacar quitando" /* + espada.getDaño()
			*/ + " puntos de vida");
	}
}
