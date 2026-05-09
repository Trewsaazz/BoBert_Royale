package Personajes;

import java.util.Random;
import java.util.Scanner;

public class GuerreroChorreante extends Enemigo implements Guerrero{

	Scanner sc = new Scanner(System.in);
	
	public GuerreroChorreante() {
		
		System.out.println("Cual es tu fuerza?");
		setFuerza(sc.nextInt());
		
		System.out.println("Cual es tu agilidad?");
		setAgilidad(sc.nextInt());
		
		System.out.println("Cual es tu resistencia?");
		setResistencia(sc.nextInt());
	}
	@Override
	public void guerrilla() {
		
		System.out.println("Has usado la espada de lotus para atacar quitando" /* + espadaL.getDaño()
			*/ + " puntos de vida");
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
