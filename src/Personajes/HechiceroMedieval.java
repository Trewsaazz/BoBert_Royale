package Personajes;

import java.util.Random;

import Acciones.*;
import Estrategia.EstrategiaDefensiva;

public class HechiceroMedieval extends Enemigo{

	public HechiceroMedieval(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaDefensiva();
	}

	@Override
	public Accion habilidad() {
		
		Random r = new Random();
		Accion action = new CambiadorDeEstados();
	
		return action;
	}
}
