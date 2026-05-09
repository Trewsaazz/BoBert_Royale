package Personajes;

import java.util.Random;
import java.util.Scanner;

public class HechiceroMedieval extends Enemigo implements Hechicero{

Scanner sc = new Scanner(System.in);
	
	public HechiceroMedieval() {
		
		System.out.println("Cual es tu fuerza?");
		setFuerza(sc.nextInt());
		
		System.out.println("Cual es tu agilidad?");
		setAgilidad(sc.nextInt());
		
		System.out.println("Cual es tu resistencia?");
		setResistencia(sc.nextInt());
	}

	@Override
	public void hechizo() {
		
		Random r = new Random();
		System.out.println("Has usado el hechizo de fuego");
		if((r.nextInt(5) +1) != 1) {
			
			System.out.println("El enemigo se ha quemado");
		}else {
			
			System.out.println("Has fallado, apunta mejor");
		}
		
	}
	
	@Override
	public void atacar() {
			
		System.out.println("He atacado al enemigo");
	}

	@Override
	public void descansar() {
		
		Random r = new Random();
		System.out.println("Has descansado");
		if((r.nextInt(3) +1) != 1) {
			
			System.out.println("No ha ocurrido nada");
		}else {
			
			System.out.println("Te has curado 10 pts de vida.");
		}
	}
}
