package Acciones;

import Personajes.Enemigo;

public class Defensa implements Accion{

	@Override
	public int accion(Enemigo enemy) {
		
		return enemy.getResistencia();
	}

	
}
