package Personajes;

import java.util.Random;
import java.util.Scanner;

public class MutanteEspacial extends Enemigo implements Mutante{

	Scanner sc = new Scanner(System.in);
	
	public MutanteEspacial() {  //TODOS los constructores estos son para players. Habrá otros para npcs
		
		System.out.println("Cual es tu fuerza?");
		setFuerza(sc.nextInt());
		
		System.out.println("Cual es tu agilidad?");
		setAgilidad(sc.nextInt());
		
		System.out.println("Cual es tu resistencia?");
		setResistencia(sc.nextInt());
	}

	@Override
	public void mutar() {

		Random r = new Random();
		if((r.nextInt(2) +1) != 1) {
			
			System.out.println("Te has transformado en un Jedi con los mismos atributos y vida");
			//constructor Jedi
		}else {
			
			System.out.println("Te has transformado en un guerrero con los mismos atributos y vida");
			//constructor guerrero espacial
		}
		System.out.println("El enemigo está confundido");
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
