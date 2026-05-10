package Personajes;

import Acciones.*;
import Estrategia.EstrategiaEquilibrada;
import Mundos.*;

public class GuerreroMedieval extends Enemigo{
	
	private Mundo mundo;
	private TipoEnemigo tipoEnemigo;
	
	public GuerreroMedieval(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaEquilibrada());
		this.mundo = new Medieval();
		this.tipoEnemigo = tipoEnemigo.GUERRERO;
	}

	@Override
	public Accion habilidad(){
		
		System.out.println("Has usado la espada de acero.");
		Accion action = new Ataque();
		action = new Poderoso(action);
		return action;
	}
	@Override
	public String toString() {
		
		return tipoEnemigo.toString() + "del mundo " + mundo.toString() + ".\n";
	}
}
