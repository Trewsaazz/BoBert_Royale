package Personajes;

import java.util.Random;

public class MutanteEspacial extends Enemigo{

	public MutanteEspacial(Tipo creacion) {
		super(creacion);
	}

	@Override
	public void habilidad() {

		Random r = new Random();
		if((r.nextInt(2) +1) != 1) {
			
			System.out.println("Te has transformado en un Jedi con los mismos atributos y vida");
			//constructor Jedi
		}else {
			
			System.out.println("Te has transformado en un guerrero con los mismos atributos y vida");
			//constructor guerrero espacial
		}
		System.out.println("El enemigo está confundido");
	}
}
