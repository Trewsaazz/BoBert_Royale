package DinamicaJuego;

import Personajes.Enemigo;
import Personajes.FabricaCharca;
import Personajes.FabricaEnemigos;
import Personajes.FabricaEspacial;
import Personajes.FabricaMedieval;
import Personajes.Tipo;

import java.util.Scanner;
import java.util.Random;

public class GameController {
	private Enemigo jugador;
    private Enemigo enemigoActual;
    private FabricaEnemigos fabrica;
    private String mundoActual;
    private boolean enCombate;
    private Scanner scanner;
    
    public GameController() {
        scanner = new Scanner(System.in);
    }
    
    public void iniciarPartida() {
    	//inicio de partida
    	System.out.println("=== NUEVA PARTIDA ===");
        
        
        //eleccion de Mundos par ver de donde son los enemigos
        System.out.println("\nElige un mundo: \n1-Charca\n2-Medieval\n3-Espacio");
        int opcMundo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\nElige tu Clase: \n1-Guerrero\n2-Hechizero\n3-Mutante");
        int opcClase = scanner.nextInt();
		scanner.nextLine();
        
		
        switch(opcMundo){
        	case 1:
        		mundoActual = "Charca";
        		fabrica = new FabricaCharca();
        		break;
        	case 2:
        		mundoActual = "Medieval";
        		fabrica = new FabricaMedieval();
        		break;
        	case 3:
        		mundoActual = "Espacio";
        		fabrica = new FabricaEspacial();
        		break;
        	//si pones un numero no seleccionado te pines por defecto en medieval
        	default:
        		System.out.println("\nElegiste una mundo inexistente, Por defecto sera Medieval");
        		mundoActual = "Medieval";
        		fabrica = new FabricaMedieval();
        }
        
        switch (opcClase) {
	        case 0:
	            enemigoActual = fabrica.crearGuerrero(Tipo.Jugador);
	            break;
	        case 1:
	            enemigoActual = fabrica.crearHechicero(Tipo.Jugador);
	            break;
	        case 2:
	            enemigoActual = fabrica.crearMutante(Tipo.Jugador);
	            break;
	        default:
	        	System.out.println("\nElegiste una clase inexistente, Por defecto sera Guerrero");
	        	enemigoActual = fabrica.crearGuerrero(Tipo.Jugador);
	    }
        
        System.out.println("\nComienza la aventura en " + mundoActual + "");
        Combate();
        
    }
    
    public void Combate() {
    	//chequea si estas vivo
    	if(jugador.getVida()<=0) {
    		finPartida();
    		return;
    	}
    	
    	Tipo clase = Tipo.Enemigo;
    	
    	//selecciona si aleatoriamente 
    	Random rand = new Random();
    	int tipo = rand.nextInt(3);
    	switch (tipo) {
	        case 0:
	            enemigoActual = fabrica.crearGuerrero(clase);
	            break;
	        case 1:
	            enemigoActual = fabrica.crearHechicero(clase);
	            break;
	        case 2:
	            enemigoActual = fabrica.crearMutante(clase);
	            break;
	    }
    	System.out.println("-- Inciativa--");
    	System.out.println("Enemigo: " + enemigoActual + " de " + mundoActual);
    	System.out.println("Vida del Enemigo: "+ enemigoActual.getVida());
    	System.out.println("Tu Vida: "+ jugador.getVida());
    	
    	boolean enCombate = true;
    	boolean turnoJugador;
    	
    	int iniciativa = rand.nextInt(100) + 1;
    	
    	if(jugador.getAgilidad() > enemigoActual.getAgilidad() && iniciativa >= 30) {
    		turnoJugador = true;
    	}else if(jugador.getAgilidad() > enemigoActual.getAgilidad() && iniciativa <= 30) {
    		turnoJugador = true;
    	}else {
    		turnoJugador = false;
    	}
    	
    	 
        System.out.println(turnoJugador ? "Atacas primero" : "El enemigo ataca primero");
        
        //Rondas del Combate
        while(enCombate && jugador.getVida() > 0 && enemigoActual.getVida() > 0) {
        	
        	if (turnoJugador) {
        		System.out.println("\nTu turno");
        		//Necesitamos una manera de mandar la accion que toma el jugador a Turno
        		Turno(turnoJugador, accion);
        		if(enemigoActual.getVida()<=0) {
        			enCombate = false;
        		}
        	}else {
        		System.out.println("\nTurno Enemigo");
        		//Necesitamos una manera de mandar la accion que toma el enemigo a Turno
        		Turno(turnoJugador, accion);
        		if(jugador.getVida()<=0) {
        			enCombate = false;
        		}
        	}
        	turnoJugador = !turnoJugador;
        }
        
        //Chequea si va al siguiente Combate o si as muerto
        if(jugador.getVida()<=0) {
        	finPartida();
        }else {
        	int puntosGanados = 10;
            jugador.acumularPuntos(puntosGanados);
            System.out.println("\n¡Has ganado el combate!");
            Combate();
        }
    }
    
    
    public void Turno(boolean esPC, Accion accion){
    	CalcDanio calculador = CalcDanio.getInstance();
    	
    	Enemigo atacante = esPC ? jugador : enemigoActual;
        Enemigo defensor = esPC ? enemigoActual : jugador;
        
        
        switch(accion.getTipo()) {
        	//hace daño al oponente 
        	case ATACAR:
        		//calcula el daño gracias al singleton
        		int dmg = calculador.calc(atacante.getFuerza(), defensor.getResistencia());
        		defensor.quitarVida(dmg);
        		System.out.println(atacante + " ataca y causa " + dmg + " de daño.");
                System.out.println(defensor + " tiene " + defensor.getVida() + " de vida restante.");
                break;
            //Se de fiende para el proximo turno
        	case DEFENDER:
        		//ahora mismo no hace nada
        		System.out.println(atacante + " se defiende. Reduce el daño recibido hasta el próximo turno.");
        		break;
        	//Usa una habilida propia de la clase
        	case HABILIDAD:
        		//todavia no se ha implementado como hacemos las habilidades
                break;
            //Cura al Personaje
        	case DESCANSAR:
        		//como lo tengo estructurado no puedo acceder al descansar de los Personajes
        		int cura = 10;
        		atacante.setVida(atacante.getVida() + cura);
        		System.out.println(atacante + " descansa y recupera " + cura + " de vida.");
                break;
        }
        
        // Verificar si alguien murió
        if (jugador.getVida() <= 0) {
            System.out.println(jugador + " ha sido derrotado...");
            enCombate = false;
        } else if (enemigoActual.getVida() <= 0) {
            System.out.println(enemigoActual + " ha sido derrotado.");
            enCombate = false;
        }
    	
    }
    
    public void finPartida() {
        System.out.println("\n--- GAME OVER ---");
        System.out.println("Puntuación final: " + jugador.getPuntos());
        System.out.println("Gracias por jugar.");
        System.exit(0);
    }
    
    
}
