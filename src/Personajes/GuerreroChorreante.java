package Personajes;

import Acciones.*;
import Estrategia.EstrategiaEquilibrada;

public class GuerreroChorreante extends Enemigo{

	public GuerreroChorreante(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaEquilibrada();
	}

	@Override
	public Accion habilidad() {
		
		System.out.println("Has usado la espada de lotus.");
		Accion action = new Ataque();
		action = new Debil(action);
		return action;
	}
}
