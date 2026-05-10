package Personajes;

import java.util.Random;

import Estrategia.EstrategiaDefensiva;

public class MutanteMedieval extends Enemigo{
	
	public MutanteMedieval(Tipo creacion) {
		super(creacion);
		estrategia = new EstrategiaDefensiva();
	}

	@Override
	public void habilidad() {

		Random r = new Random();
		if((r.nextInt(2) +1) != 1) {
			
			System.out.println("Te has transformado en un hechicero con los mismos atributos y vida");
			//constructor hechicero medieval
		}else {
			
			System.out.println("Te has transformado en un guerrero con los mismos atributos y vida");
			//constructor guerrero medieval
		}
		System.out.println("El enemigo está confundido");
	}
}
