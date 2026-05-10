package Estrategia;
import Acciones.*;
import Personajes.Enemigo;

public interface IEstrategia {
	public Accion DecidirAccion(Enemigo enemigo, Enemigo jugador);
	
}
