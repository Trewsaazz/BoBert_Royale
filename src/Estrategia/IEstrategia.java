package Estrategia;
import Acciones.*;
import Personajes.Enemigo;

public interface IEstrategia {
	public int DecidirAccion(Enemigo enemigo, Enemigo jugador);
	
}
