package Personajes;

public class GuerreroChorreante extends Enemigo{

	public GuerreroChorreante(Tipo creacion) {
		super(creacion);
	}

	@Override
	public void habilidad() {
		
		System.out.println("Has usado la espada de lotus para atacar quitando" /* + espadaL.getDaño()
			*/ + " puntos de vida");
	}
}
