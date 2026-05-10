package Personajes;

import Estrategia.IEstrategia;
import Armas.IArmas;

public abstract class Enemigo {

	private int fuerza;
	private int resistencia;
	private int agilidad;
	private int vida = 100;
	
	
	private IEstrategia estrategia;
	private IArmas arma;
	
	/*TODO implementar las estrategias (nico)*/ 
	
	
	
	public int getFuerza() {
		
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		
		this.fuerza = fuerza;
	}
	public int getResistencia() {
		
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		
		this.resistencia = resistencia;
	}
	public int getAgilidad() {
		
		return agilidad;
	}
	public void setAgilidad(int agilidad) {
		
		this.agilidad = agilidad;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
	
}
