package Personajes;

import Acciones.*;
import Estrategia.EstrategiaEquilibrada;
import Mundos.*;

public class GuerreroEspacial extends Enemigo{
	
	private Mundo mundo;
	private TipoEnemigo tipoEnemigo;
	
	public GuerreroEspacial(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaEquilibrada());
		this.mundo = new Espacio();
		this.tipoEnemigo = tipoEnemigo.GUERRERO;
	}

	@Override
	public Accion habilidad() {
		
		System.out.println("Has usado la espada laser");
		Accion action = new Ataque();
		action = new Poderoso(action);
		return action;
	}
	@Override
	public String toString() {
		
		return tipoEnemigo.toString() + "del mundo " + mundo.toString() + ".\n";
	}
}
