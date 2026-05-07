package EstadosPersonajes;

public class Quemado {
	int turnosRestantes = 3;
	public void alIniciarTurno(Personaje p) {
		p.recibirDano(7);  // pierde 5 de vida por la quemadura
        turnosRestantes--;
        if (turnosRestantes <= 0) {
            p.setEstado(new Normal());  //cambia de estado
        }
		
	}

	@Override
	public boolean puedeActuar() {
		return true;
	}
	
	public String toString() {
		return "Quemado";
	}
}
