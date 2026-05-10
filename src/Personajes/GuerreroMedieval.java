package Personajes;

import Acciones.*;
import Estrategia.EstrategiaEquilibrada;

public class GuerreroMedieval extends Enemigo{
	
	public GuerreroMedieval(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaEquilibrada();
	}

	@Override
	public Accion habilidad(){
		
		System.out.println("Has usado la espada de acero.");
		Accion action = new Ataque();
		action = new Poderoso(action);
		return action;
	}
}
