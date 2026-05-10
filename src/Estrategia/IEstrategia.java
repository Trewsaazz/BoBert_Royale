package Estrategia;

import Personajes.Enemigo;

public interface IEstrategia {
	public int DecidirAccion(Enemigo enemigo, Enemigo jugador);
}
