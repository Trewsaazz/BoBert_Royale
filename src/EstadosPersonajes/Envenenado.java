package EstadosPersonajes;

import Personajes.Enemigo;

public class Envenenado implements Estado{
	int turnosRestantes = 3;
	
	public void alIniciarTurno(Enemigo p) {
		p.quitarVidaSimple(3);  // pierde 3 de vida por el veneno
        turnosRestantes--;
        if (turnosRestantes <= 0) {
            p.setEstado(new Normal());  //cambia de estado
        }
	}

	@Override
	public boolean puedeActuar() {
		int randomNum = (int)(Math.random() * 101);
		if(randomNum <10) {
			return true;
		}else {
			return false;
		}
		
		//10% chance de que no ataque por veneno
	}
	
	public String toString() {
		return "Envenenado";
	}
}
