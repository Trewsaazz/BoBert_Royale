package EstadosPersonajes;

public interface Estado {

	void alIniciarTurno(Personaje p);
	boolean puedeActuar();
	String toString();
}
