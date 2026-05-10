package Personajes;

import java.util.Random;

import Acciones.*;
import Estrategia.EstrategiaDefensiva;
import Estrategia.EstrategiaEquilibrada;

public class Jedi extends Enemigo{

	public Jedi(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaDefensiva());
	}

	@Override
	public Accion habilidad() {
		
		Random r = new Random();
		Accion action = new CambiadorDeEstados();
		
		System.out.println("Has soltado laseres por las manos");
		if((r.nextInt(4) +1) != 1) { //esto podria depender del atributo de fuerza o algo
			
			System.out.println("El enemigo se ha paralizado");
			return action;
		}else {
			
			System.out.println("Has fallado, apunta mejor");
		}
		
		return null;
	}
}
