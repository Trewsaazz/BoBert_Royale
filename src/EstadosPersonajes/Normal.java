package EstadosPersonajes;

import Personajes.Enemigo;

public class Normal implements Estado{
	
	public void alIniciarTurno() {
	
	}

	@Override
	public boolean puedeActuar() {
		return true;
	}
	
	public String toString() {
		return "Normal";
	}

	@Override
	public void alIniciarTurno(Enemigo p) {
		// TODO Auto-generated method stub
		
	}
}
