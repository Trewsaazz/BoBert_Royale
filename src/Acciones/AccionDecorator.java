package Acciones;

import Personajes.Enemigo;

public class AccionDecorator implements Accion{

	protected Accion action;
	
	public AccionDecorator(Accion accion) {
		
		this.action = accion;
	}

	@Override
	public int accion(Enemigo enemy) {
		
		int num = this.action.accion(enemy);
		return num;
	}
}
