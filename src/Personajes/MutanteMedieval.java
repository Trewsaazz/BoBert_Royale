package Personajes;

import java.util.Random;

import Acciones.*;
import Estrategia.EstrategiaDefensiva;

public class MutanteMedieval extends Enemigo{
	
	public MutanteMedieval(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaDefensiva());
	}

	@Override
	public Accion habilidad() {

		return null;
	}
}
