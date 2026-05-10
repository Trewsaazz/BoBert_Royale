package Personajes;

import Acciones.*;
import Estrategia.EstrategiaEquilibrada;

public class GuerreroEspacial extends Enemigo{
	
	public GuerreroEspacial(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaEquilibrada());
	}

	@Override
	public Accion habilidad() {
		
		System.out.println("Has usado la espada laser");
		Accion action = new Ataque();
		action = new Poderoso(action);
		return action;
	}
}
