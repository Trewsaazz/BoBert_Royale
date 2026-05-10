package Personajes;

import java.util.Random;

import Acciones.*;
import Estrategia.EstrategiaDefensiva;
import Mundos.*;

public class HechiceroMedieval extends Enemigo{

	private Mundo mundo;
	private TipoEnemigo tipoEnemigo;
	
	public HechiceroMedieval(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaDefensiva());
		this.mundo = new Medieval();
		this.tipoEnemigo = tipoEnemigo.HECHICERO;
	}

	@Override
	public Accion habilidad() {
		
		Random r = new Random();
		Accion action = new CambiadorDeEstados();
	
		return action;
	}
	@Override
	public String toString() {
		
		return tipoEnemigo.toString() + " del mundo " + mundo.toString() + ".\n";
	}
}
