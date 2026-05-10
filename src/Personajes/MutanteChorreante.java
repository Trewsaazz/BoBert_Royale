package Personajes;

import java.util.Random;

import Acciones.*;
import Estrategia.EstrategiaAgresiva;

public class MutanteChorreante extends Enemigo{

	
	public MutanteChorreante(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaAgresiva();
	}

	@Override
	public Accion habilidad() {
		
		return null;
	}
}
