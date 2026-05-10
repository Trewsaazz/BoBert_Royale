package Personajes;

import java.util.Random;

public class Jedi extends Enemigo{

	public Jedi(Tipo creacion) {
		super(creacion);
	}

	@Override
	public void habilidad() {
		
		Random r = new Random();
		System.out.println("Has soltado laseres por las manos");
		if((r.nextInt(4) +1) != 1) { //esto podria depender del atributo de fuerza o algo
			
			System.out.println("El enemigo se ha paralizado");
		}else {
			
			System.out.println("Has fallado, apunta mejor");
		}
		
	}
}
