package Personajes;


public class GuerreroMedieval extends Enemigo{
	
	public GuerreroMedieval(Tipo creacion) {
		super(creacion);
	}

	@Override
	public void habilidad() {
		
		System.out.println("Has usado la espada de acero para atacar quitando" /* + espada.getDaño()
			*/ + " puntos de vida");
	}
}
