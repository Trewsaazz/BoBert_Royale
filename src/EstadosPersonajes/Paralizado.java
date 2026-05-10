package EstadosPersonajes;

import Personajes.Enemigo;

public class Paralizado implements Estado{

	@Override
	public void alIniciarTurno(Enemigo p) {
		//llamar a metodo relevante
		
	}

	@Override
	public boolean puedeActuar() {
		int randomNum = (int)(Math.random() * 101);
		if(randomNum <51) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Paralizado";
	}

}
