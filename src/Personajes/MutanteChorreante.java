package Personajes;

import java.util.Random;

import Estrategia.EstrategiaAgresiva;

public class MutanteChorreante extends Enemigo{

	
	public MutanteChorreante(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaAgresiva();
	}

	@Override
	public void habilidad() {

		Random r = new Random();
		if((r.nextInt(2) +1) != 1) {
			
			System.out.println("Te has transformado en un hechicero con los mismos atributos y vida");
			//constructor hechicero chorreante
		}else {
			
			System.out.println("Te has transformado en un guerrero con los mismos atributos y vida");
			//constructor guerrero espacial
		}
		System.out.println("El enemigo está confundido");
	}
}
