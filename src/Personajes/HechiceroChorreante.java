package Personajes;

import java.util.Random;
import java.util.Scanner;

public class HechiceroChorreante extends Enemigo implements Hechicero{

Scanner sc = new Scanner(System.in);
	
	public HechiceroChorreante() {
		
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
		System.out.println("Te has comido una tarta de queso");
		if((r.nextInt(4) +1) != 1) { //esto podria depender del atributo de fuerza o algo
			
			System.out.println("Te has curado 5 puntos de vida");
		}else {
			
			System.out.println("Eres intolerante a la lactosa");
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
