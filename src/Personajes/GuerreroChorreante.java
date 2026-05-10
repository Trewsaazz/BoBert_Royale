package Personajes;

import Acciones.*;
import Estrategia.EstrategiaEquilibrada;
import Mundos.*;

public class GuerreroChorreante extends Enemigo{

	private Mundo mundo;
	private TipoEnemigo tipoEnemigo;
	
	public GuerreroChorreante(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaEquilibrada());
		this.mundo = new Charca();
		this.tipoEnemigo = tipoEnemigo.GUERRERO;
	}

	@Override
	public Accion habilidad() {
		
		System.out.println("Has usado la espada de lotus.");
		Accion action = new Ataque();
		action = new Debil(action);
		return action;
	}
	@Override
	public String toString() {
		
		return tipoEnemigo.toString() + "del mundo " + mundo.toString() + ".\n";
	}
}
