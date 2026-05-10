package Estrategia;

import java.util.Random;
/* Faltan imports */
public class EstrategiaEquilibrada implements IEstrategia{
	
	
	private Random numRandom = new Random();
	
	@Override
	public Accion elegirAccion(Enemigo enemigo, Jugador jugador) {
		int numRandom = random.nextInt(100) + 1; /*Numero aleatorios de 1 a 100*/
		
		if(numRandom <= 50) {
			return new Atacar();
		}else if(numRandom <= 80) {
			return new Defender();
		}else {
			return new Curarse();
		}
	}
	
	@Override
	public double getProbabilidadDeCritico() {
		return 0.20;
	}
	
	@Override
	public double getBonusDefensa() {
		return 0.20;
	}
	@Override
	public double getBonusCura() {
		return 0.10;
	}

}
