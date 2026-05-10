package Personajes;

import Acciones.*;
import Estrategia.EstrategiaDefensiva;
import Mundos.*;

public class MutanteEspacial extends Enemigo{

	private Mundo mundo;
	private TipoEnemigo tipoEnemigo;
	
	public MutanteEspacial(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaDefensiva());
		this.mundo = new Espacio();
		this.tipoEnemigo = tipoEnemigo.MUTANTE;
	}

	@Override
	public Accion habilidad() {
		
		return null;
	}
	
	@Override
	public String toString() {
		
		return tipoEnemigo.toString() + "del mundo " + mundo.toString() + ".\n";
	}
}
