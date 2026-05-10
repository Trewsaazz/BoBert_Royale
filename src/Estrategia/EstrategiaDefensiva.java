package Estrategia;

import java.util.Random;

import Acciones.*;
import Personajes.*;

public class EstrategiaDefensiva implements IEstrategia{
	
	private Random numRandom = new Random();
	
	@Override
	public Accion DecidirAccion(Enemigo enemigo, Enemigo jugador) {
		int numero = numRandom.nextInt(100) + 1; /*Numero aleatorios de 1 a 100*/
		
		if(numero <= 25) {
			return new Ataque();
		}else if(numero <= 70) {
			return new Defensa();
		}else {
			Accion habilidad = enemigo.habilidad();
			
			if(habilidad != null) {
				return habilidad;
			}
			return new Defensa();
		}
	}
	
}
