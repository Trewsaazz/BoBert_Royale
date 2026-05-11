package Personajes;

import java.util.Random;

import Acciones.*;
import Estrategia.EstrategiaAgresiva;
import Estrategia.EstrategiaDefensiva;
import Mundos.*;

public class MutanteChorreante extends Enemigo{

	private Mundo mundo;
	private TipoEnemigo tipoEnemigo;
	
	public MutanteChorreante(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaAgresiva());
		this.mundo = new Charca();
		this.tipoEnemigo = tipoEnemigo.MUTANTE;
	}

	@Override
	public Accion habilidad() {
		
		return null;
	}
	@Override
	public String toString() {
		
		return tipoEnemigo.toString() + " del mundo " + mundo.toString() + ".\n";
	}
}
