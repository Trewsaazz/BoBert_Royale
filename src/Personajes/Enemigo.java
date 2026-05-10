package Personajes;

import java.util.Random;
import java.util.Scanner;

import Acciones.*;

public abstract class Enemigo {

	
	
	private int fuerza;
	private int resistencia;
	private int agilidad;
	private int vida;
	private Accion acciones;
	
Scanner sc = new Scanner(System.in);
	
	public Enemigo(Tipo creacion) {
		
		if(creacion == Tipo.Jugador) {
			
			System.out.println("Cual es tu fuerza?");
			this.fuerza = sc.nextInt();
			
			System.out.println("Cual es tu agilidad?");
			this.agilidad = sc.nextInt();
			
			System.out.println("Cual es tu resistencia?");
			this. resistencia = sc.nextInt();
			
		}else if(creacion == Tipo.Enemigo) {
			
			Random r = new Random();
			
			this.fuerza = r.nextInt(80) + 20;
			
			this.agilidad = r.nextInt(80) + 20;
			
			this.resistencia = r.nextInt(80) + 20;
			
		}else {
			
			System.out.println("Tipo de creacion desconocido");
		}
		
		this.vida = 100;
		
	}
	
	public void habilidad() {
		
		System.out.println("No tienes habilidades especiales");
	}

	/*public void descansar() {
		
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
	
}

