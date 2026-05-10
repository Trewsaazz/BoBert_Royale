package DinamicaJuego;

import Personajes.*;
import java.util.Scanner;
import EstadosPersonajes.*;
import Acciones.*;

import java.util.Random;

public class GameController {
	private Enemigo jugador;
    private Enemigo enemigoActual;
    private FabricaEnemigos fabrica;
    private String mundoActual;
    private boolean enCombate;
    private int puntos;
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
        //Seleccion de tu clase
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
        
        //te crea tu player segun tu clase y tu mundo
        switch (opcClase) {
	        case 1:
	            jugador = fabrica.crearGuerrero(Tipo.Jugador);
	            break;
	        case 2:
	            jugador = fabrica.crearHechicero(Tipo.Jugador);
	            break;
	        case 3:
	            jugador = fabrica.crearMutante(Tipo.Jugador);
	            break;
	        default:
	        	System.out.println("\nElegiste una clase inexistente, Por defecto sera Guerrero");
	        	jugador = fabrica.crearGuerrero(Tipo.Jugador);
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
    	System.out.println("Test");
    	
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
    	}else if(jugador.getAgilidad() <= enemigoActual.getAgilidad() && iniciativa <= 30) {
    		turnoJugador = true;
    	}else {
    		turnoJugador = false;
    	}
    	
    	 
        System.out.println(turnoJugador ? "Atacas primero" : "El enemigo ataca primero");
        
        //Rondas del Combate
        while(enCombate && jugador.getVida() > 0 && enemigoActual.getVida() > 0) {
        	

            System.out.println("\nTu tienes " + jugador.getVida() + " de vida restante.");
            System.out.println(enemigoActual + " tiene " + enemigoActual.getVida() + " de vida restante.");
        	
        	int decision;
        	if (turnoJugador) {
        		jugador.getEstado().alIniciarTurno(jugador);
        		if(jugador.getEstado().puedeActuar() == true) {
	        		System.out.println("\nTu turno");
	        		System.out.println("1-.Atacar\n2-.Defender\n3-.Habilidad");
	        		decision = scanner.nextInt();
	        		Turno(turnoJugador, decision);
	        		
        		}else {
        			System.out.println("Estas "+jugador.getEstado().toString()+"no has podido atacar!");
        		}
        		
        		if(enemigoActual.getVida()<=0) {
        			enCombate = false;
        		}
        		
        	}else {
        		enemigoActual.getEstado().alIniciarTurno(jugador);
        		if(enemigoActual.getEstado().puedeActuar() == true) {
        		
        		System.out.println("\nTurno Enemigo");
        		decision = enemigoActual.decidirSiguienteAccion(jugador);
        		Turno(turnoJugador, decision);
        		}else {
        			System.out.println("Estas "+enemigoActual.getEstado().toString()+"no has podido atacar!");
        		}
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
            puntos += puntosGanados;
            System.out.println("\n¡Has ganado el combate!");
            Combate();
        }
    }
    
    
    public void Turno(boolean esPC, int decision){
    	CalcDanio calculador = CalcDanio.getInstance();
    	
    	Enemigo atacante = esPC ? jugador : enemigoActual;
        Enemigo defensor = esPC ? enemigoActual : jugador;
        
        
        switch(decision) {
        	//hace daño al oponente 
        	case 1:
        		//calcula el daño gracias al singleton
        		Accion accion = new Ataque();
        		if(atacante.getFuerza() >=70) {
        			
        			accion = new Poderoso(accion);
        		}else if(atacante.getFuerza() <= 30){
        			
        			accion = new Debil(accion);
        		}
        		int dmg = calculador.calc(accion.accion(atacante), defensor.getResistencia());
        		
        		defensor.setVida(defensor.getVida() - dmg);
        		
        		System.out.println(atacante + " ataca y causa " + dmg + " de daño.");
                break;
            //Se de fiende para el proximo turno
        	case 2:
        		Accion action = new Defensa();
        		if(atacante.getResistencia() >=70) {
        			
        			action = new Poderoso(action);
        		}else if(atacante.getResistencia() <= 30){
        			
        			action = new Debil(action);
        		}
        		System.out.println(atacante + " se cura: " + action.accion(atacante) );
        		atacante.setVida(atacante.getVida() + action.accion(atacante));
        		break;
        	//Usa una habilidad propia de la clase
        	case 3:
        		Accion resultado;
        		
        		resultado = atacante.habilidad();
        		
        		//hace un ataque si la habilidad proporciona un ataque
        		if(resultado instanceof Ataque) {
        			int danio = calculador.calc(resultado.accion(atacante), defensor.getResistencia());
            		
            		defensor.setVida(defensor.getVida() - danio);
            		
            		System.out.println(atacante + " ataca y causa " + danio + " de daño.");
                    System.out.println(defensor + " tiene " + defensor.getVida() + " de vida restante.");
        		
                //Hace una defensa si la habildad cura
        		}else if(resultado instanceof Defensa) {
        			System.out.println(atacante + " se cura: " + resultado.accion(atacante) );
            		atacante.setVida(atacante.getVida() + resultado.accion(atacante));
        		}
        		
        		if(resultado instanceof CambiadorDeEstados) {
        			
        			if(atacante instanceof HechiceroMedieval) {
        				
        				defensor.setEstado(new Quemado());
        			}else if(atacante instanceof Jedi) {
        				
        				defensor.setEstado(new Paralizado());
        			}
        		}else if(resultado == null) {
        			
        			if(atacante instanceof MutanteEspacial || atacante instanceof MutanteMedieval ||atacante instanceof MutanteChorreante) {
        				//la habilidad hace que cambi de clase
        				Random cambio = new Random();
        		    	int prop  = cambio.nextInt(100) + 1;
        		    	if(prop> 50) {
        		    		enemigoActual = fabrica.crearGuerrero(Tipo.Enemigo);
        		    	}else {
        		    		enemigoActual = fabrica.crearHechicero(Tipo.Enemigo);
        		    	}
        		    	enemigoActual.setEstado(new Paralizado());
        				 
        			}
        		}
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
        System.out.println("Puntuación final: " + puntos);
        System.out.println("Gracias por jugar.");
        System.exit(0);
    }
    
    
}
