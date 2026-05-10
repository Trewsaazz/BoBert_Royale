package Personajes;

import java.util.Random;

import Acciones.*;
import Estrategia.EstrategiaDefensiva;

public class MutanteEspacial extends Enemigo{

	public MutanteEspacial(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaDefensiva());
	}

	@Override
	public Accion habilidad() {
		
		return null;
	}
}
