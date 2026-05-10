package Personajes;

import java.util.Random;
import java.util.Scanner;

import Acciones.*;
import EstadosPersonajes.*;
import Estrategia.*;


public abstract class Enemigo {

	private int fuerza;
	private int resistencia;
	private int agilidad;
	private int vida;
	private Accion acciones;

	private Estado estado;
	private IEstrategia estrategia;
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public Enemigo(Tipo creacion) {
		
		if(creacion == Tipo.Jugador) {
			
			estado = new Normal();
			
			System.out.println("Cual es tu fuerza?");
			this.fuerza = sc.nextInt();
			
			System.out.println("Cual es tu agilidad?");
			this.agilidad = sc.nextInt();
			
			System.out.println("Cual es tu resistencia?");
			this. resistencia = sc.nextInt();
			
		}else if(creacion == Tipo.Enemigo) {
			
			Random r = new Random();
			

			this.fuerza = r.nextInt(80) + 20;

			estado = new Normal();
			
			setFuerza(r.nextInt(80) + 20);
			
			this.agilidad = r.nextInt(80) + 20;
			
			this.resistencia = r.nextInt(80) + 20;
			
		}else {
			
			System.out.println("Tipo de creacion desconocido");
		}
		
		this.vida = 100;
		
	}
	
	
	public final Accion decidirSiguienteAccion(Enemigo jugador) {
		prepararDecision();

		Accion accion = estrategia.DecidirAccion(this, jugador);

		accion = adaptarAccionSegunTipo(accion);

		return accion;
	}

	protected void prepararDecision() {
		System.out.println("El enemigo analiza la situación...");
	}

	protected Accion adaptarAccionSegunTipo(Accion accion) {
		return accion;
	}

	public Accion habilidad() {
		System.out.println("No tienes habilidades especiales");
		return null;
	}
	
	public Estado getEstado() {
		return estado;
	}

	/*public void descansar() {

	public void quitarVidaSimple(int i){
	
		vida = vida-i;
	}
	
	public void descansar() {

		
		Random r = new Random();
		System.out.println("Has descansado");
		if((r.nextInt(3) +1) != 1) {
			
			System.out.println("No ha ocurrido nada");
		}else {
			
			System.out.println("Te has curado 10 pts de vida.");
		}
	}
	*/
	
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
	
	public void setEstado(Estado E) {
		this.estado = E;
	}
	
	public void quitarVidaSimple(int v) {
		vida = vida-v;
	}
	
	public IEstrategia getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
}

