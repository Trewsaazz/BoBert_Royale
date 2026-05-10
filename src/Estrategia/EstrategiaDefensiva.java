package Estrategia;

import java.util.Random;

public class EstrategiaDefensiva implements IEstrategia{
	
	private Random numRandom = new Random();
	
	@Override
	public Accion elegirAccion(Enemigo enemigo, Jugador jugador) {
		int numero = random.nextInt(100) + 1; /*Numero aleatorios de 1 a 100*/
		
		if(numero <= 50) {
			return new Defender();
		}else if(numero <= 30) {
			return new Atacar();
		}else if(numero <= 20) {
			return new Curarse();
		}
	}
	
	@Override
	public double getProbabilidadDeCritico() {
		return 0.0; /*Returnea 0 porque la defensiva no puede tener bonus de ataque*/
	}
	
	@Override
	public double getBonusDefensa() {
		return 0.50;
	}
	@Override
	public double getBonusCura() {
		return 0.20;
	}
}
