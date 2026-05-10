package Personajes;

import java.util.Random;

import Acciones.*;
import Estrategia.EstrategiaDefensiva;
import Mundos.*;

public class HechiceroChorreante extends Enemigo{

	private Mundo mundo;
	private TipoEnemigo tipoEnemigo;
	
	public HechiceroChorreante(Tipo creacion) {
		super(creacion);
		setEstrategia(new EstrategiaDefensiva());
		this.mundo = new Charca();
		this.tipoEnemigo = tipoEnemigo.HECHICERO;
	}

	@Override
	public Accion habilidad() {
		
		Random r = new Random();
		Accion action = new Defensa();
		
		System.out.println("Te has comido una tarta de queso");
		if((r.nextInt(4) +1) != 1) { 
			
			System.out.println("Te has curado 15 puntos de vida");
			action = new Poderoso(action);
		}else {
			
			System.out.println("Eres intolerante a la lactosa");
			action = null;
		}
		
		return action;
	}
	@Override
	public String toString() {
		
		return tipoEnemigo.toString() + " del mundo " + mundo.toString() + ".\n";
	}
}
