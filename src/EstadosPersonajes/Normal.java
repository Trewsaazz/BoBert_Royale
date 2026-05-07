package EstadosPersonajes;

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
}
