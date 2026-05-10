package Personajes;

import java.util.Random;

import Estrategia.EstrategiaDefensiva;

public class HechiceroChorreante extends Enemigo{

	public HechiceroChorreante(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaDefensiva();
	}

	@Override
	public void habilidad() {
		
		Random r = new Random();
		System.out.println("Te has comido una tarta de queso");
		if((r.nextInt(4) +1) != 1) { //esto podria depender del atributo de fuerza o algo
			
			System.out.println("Te has curado 5 puntos de vida");
		}else {
			
			System.out.println("Eres intolerante a la lactosa");
		}
		
	}
}
