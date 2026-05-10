package Acciones;

import Personajes.Enemigo;

public class Debil extends AccionDecorator{

public Debil(Accion action) {
		
		super(action);
	}
	
	@Override
	
	public int accion(Enemigo enemy) {
		
		return action.accion(enemy) - 10;
	}
}
