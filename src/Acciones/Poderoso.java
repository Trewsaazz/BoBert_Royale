package Acciones;

import Personajes.Enemigo;

public class Poderoso extends AccionDecorator{

	
	public Poderoso(Accion action) {
		
		super(action);
	}
	
	@Override
	
	public int accion(Enemigo enemy) {
		
		return action.accion(enemy) + 10;
	}
}
