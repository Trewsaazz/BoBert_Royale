package Estrategia;

import java.util.Random;
/* Faltan imports */
public class EstrategiaAgresiva implements IEstrategia{
	
	private Random numRandom = new Random();
	
	@Override
	public Accion elegirAccion(Enemigo enemigo, Jugador jugador) {
		int numero = random.nextInt(100) + 1; /*Numero aleatorios de 1 a 100*/
		
		if(numero <= 70) {
			return new Atacar();
		}else {
			return new Defender();
		}
	}
	
	@Override
	public double getProbabilidadDeCritico() {
		return 0.40;
	}
	
	@Override
	public double getBonusDefensa() {
		return 0.0; /*Returnea 0 porque la agresiva no puede tener bonus de defensa*/
	}
	
	
}
