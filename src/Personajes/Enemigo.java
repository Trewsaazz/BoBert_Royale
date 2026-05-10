package Personajes;

import java.util.Random;
import java.util.Scanner;

public abstract class Enemigo {

	
	
	private int fuerza;
	private int resistencia;
	private int agilidad;
	private int vida = 100;
	
Scanner sc = new Scanner(System.in);
	
	public Enemigo(Tipo creacion) {
		
		if(creacion == Tipo.Jugador) {
			
			System.out.println("Cual es tu fuerza?");
			setFuerza(sc.nextInt());
			
			System.out.println("Cual es tu agilidad?");
			setAgilidad(sc.nextInt());
			
			System.out.println("Cual es tu resistencia?");
			setResistencia(sc.nextInt());
			
		}else if(creacion == Tipo.Enemigo) {
			
			Random r = new Random();
			
			setFuerza(r.nextInt(80) + 20);
			
			setAgilidad(r.nextInt(80) + 20);
			
			setResistencia(r.nextInt(80) + 20);
			
		}else {
			
			System.out.println("Tipo de creacion desconocido");
		}
		
	}
	
	public void habilidad() {
		
		System.out.println("No tienes habilidades especiales");
	}
	public void atacar() {
		
		System.out.println("He atacado al enemigo");
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
