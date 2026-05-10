package Estrategia;

import java.util.Random;

import Acciones.*;
import Personajes.*;

public class EstrategiaDefensiva implements IEstrategia{
	
	private Random numRandom = new Random();
	
	@Override
	public int DecidirAccion(Enemigo enemigo, Enemigo jugador) {
		int numero = numRandom.nextInt(100) + 1; /*Numero aleatorios de 1 a 100*/
		
		if(numero <= 25) {
			return 1;
		}else if(numero <= 70) {
			return 2;
		}else {
			return 3;
		}
	}
	
}
