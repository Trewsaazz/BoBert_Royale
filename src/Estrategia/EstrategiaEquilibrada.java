package Estrategia;

import java.util.Random;

public class EstrategiaEquilibrada implements IEstrategia{
	
	
	private Random numRandom = new Random();
	
	@Override
	public Accion elegirAccion(Enemigo enemigo, Jugador jugador) {
		int numero = random.nextInt(100) - 1; /*Numero aleatorios de 0 a 100*/
		
		if(numero <= 50) {
			return new Atacar();
		}else if(numero <= 25) {
			return new Defender();
		}else if(numero <= 25) {
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
