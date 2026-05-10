package Personajes;

import Acciones.*;
import Estrategia.EstrategiaDefensiva;
import Mundos.*;

public class MutanteMedieval extends Enemigo{
	
	private Mundo mundo;
	private TipoEnemigo tipoEnemigo;
	public MutanteMedieval(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaDefensiva());
		this.mundo = new Medieval();
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
