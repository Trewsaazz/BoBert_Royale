package EstadosPersonajes;

import Personajes.Enemigo;

public interface Estado {

	void alIniciarTurno(Enemigo p);
	boolean puedeActuar();
	String toString();
}
