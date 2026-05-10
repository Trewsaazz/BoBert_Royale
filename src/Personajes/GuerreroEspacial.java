package Personajes;

import Estrategia.EstrategiaEquilibrada;

public class GuerreroEspacial extends Enemigo{
	
	public GuerreroEspacial(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaEquilibrada();
	}

	@Override
	public void habilidad() {
		
		System.out.println("Has usado la espada laser para atacar quitando" /* + espadaLa.getDaño()
			*/ + " puntos de vida");
	}
}
