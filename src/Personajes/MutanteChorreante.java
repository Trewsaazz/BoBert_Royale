package Personajes;

import java.util.Random;

import Acciones.*;
import Estrategia.EstrategiaAgresiva;
import Estrategia.EstrategiaDefensiva;

public class MutanteChorreante extends Enemigo{

	
	public MutanteChorreante(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaDefensiva());
	}

	@Override
	public Accion habilidad() {
		
		return null;
	}
}
