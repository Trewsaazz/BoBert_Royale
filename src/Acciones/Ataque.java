package Acciones;

import Personajes.Enemigo;

public class Ataque implements Accion{

	@Override
	public int accion(Enemigo e) {
		
		return e.getFuerza();
	}
}
